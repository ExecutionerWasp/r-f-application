package ru.server.integration.application.service;

import org.springframework.lang.NonNull;
import ru.server.integration.application.domain.User;

/**
 * @author Alvin
 **/

public interface UserService {

    User authorize(@NonNull String login, @NonNull String password);

    User update(@NonNull User user);

}
