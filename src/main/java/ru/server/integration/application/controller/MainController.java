package ru.server.integration.application.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Alvin
 **/
@Log4j2
@Controller
@RequestMapping("/")
@RequiredArgsConstructor
public class MainController {
    @Value("${spring.profiles.active}")
    private String profile;

    @GetMapping
    public String main(Model model){
        log.info("Main page...");
        model.addAttribute("isDevMode", "dev".equals(profile));
        return "index";
    }
}
