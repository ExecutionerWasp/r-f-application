package ru.server.integration.application.service.impl;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import ru.server.integration.application.domain.User;
import ru.server.integration.application.service.UserService;

/**
 * @author Alvin
 **/

@Log4j2
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    @Override
    public User authorize(@NonNull User user) {
        log.info("Authorization user : {}", user);
        //TODO: update authorize
        return user;
    }

    @Override
    public User update(@NonNull User user) {
        log.info("Updating user : {}", user);
        //TODO: update logic
        return user;
    }
}
