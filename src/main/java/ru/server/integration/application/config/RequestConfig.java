package ru.server.integration.application.config;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

/**
 * @author Alvin
 **/

@Log4j2
@Configuration
@RequiredArgsConstructor
public class RequestConfig {

    @PostConstruct
    public void initialization() {

    }
}
