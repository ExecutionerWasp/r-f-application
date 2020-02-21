package ru.server.integration.application.config;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.Configuration;
import ru.server.integration.application.domain.Project;
import ru.server.integration.application.domain.ServiceType;
import ru.server.integration.application.domain.User;
import ru.server.integration.application.repository.ProjectRepository;
import ru.server.integration.application.repository.UserRepository;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.Collections;

/**
 * @author Alvin
 **/

@Log4j2
@Configuration
@RequiredArgsConstructor
public class RequestConfig {

    private final ProjectRepository projectRepository;
    private final UserRepository userRepository;

    @PostConstruct
    public void initialization() {
        log.info("Start project initializing...");
        database();
        log.info("Project initialized");
    }

    private void database() {
        log.info("Database initialization...");
        User user = userRepository.save(User.builder()
                .id(1L)
                .idAgency(Boolean.FALSE)
                .token("token")
                .tokenUpdatedAt(LocalDateTime.now())
                .units(3)
                .build());
        projectRepository.save(Project
                .builder()
                .created(LocalDateTime.now())
                .creator(user)
                .request("/api/request")
                .serviceTypes(Collections.singleton(ServiceType.GOOGLE_ANALYTIC))
                .title("TITLE")
                .build());
    }
}
