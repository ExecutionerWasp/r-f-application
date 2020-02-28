package ru.server.integration.application.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Alvin
 **/

@ResponseStatus(HttpStatus.FOUND)
public class UserWithCurrentLoginIsAlreadyExistException extends RuntimeException {
}
