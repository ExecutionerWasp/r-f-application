package ru.server.integration.application.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;
import ru.server.integration.application.domain.User;
import ru.server.integration.application.service.UserService;

/**
 * @author Alvin
 **/

@Log4j2
@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/login")
    public Mono<User> login(@RequestParam String login, @RequestParam String password) {
        log.info("/api/user/login");
        log.info("Login : {}, Password : {}", login, password);
        return Mono.just(userService.authorize(login, password));
    }
}
