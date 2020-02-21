package ru.server.integration.application.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Alvin
 **/
@ResponseStatus(HttpStatus.NOT_FOUND)
public class LeadNotFoundException extends RuntimeException {
}
