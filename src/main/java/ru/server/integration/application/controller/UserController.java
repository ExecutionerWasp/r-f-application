package ru.server.integration.application.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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
    public ResponseEntity<User> login(@RequestBody User user) {
        log.info("/api/user/login");
        log.info("User : {}", user);
        return ResponseEntity.ok(userService.authorize(user));
    }
}
