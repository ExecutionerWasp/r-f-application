package ru.server.integration.application.service.impl;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import ru.server.integration.application.domain.User;
import ru.server.integration.application.exception.UserNotFoundException;
import ru.server.integration.application.exception.UserWithCurrentLoginIsAlreadyExistException;
import ru.server.integration.application.repository.UserRepository;
import ru.server.integration.application.service.UserService;

/**
 * @author Alvin
 **/

@Log4j2
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public User authorize(@NonNull String login, @NonNull String password) {
        if (userRepository.existsByLogin(login)) {
            throw new UserWithCurrentLoginIsAlreadyExistException();
        }
        User user = userRepository.findByLoginAndPassword(login, password).orElseThrow(UserNotFoundException::new);
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
