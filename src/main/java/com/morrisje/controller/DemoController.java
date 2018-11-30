package com.morrisje.controller;

import com.morrisje.service.DemoService;
import lombok.extern.slf4j.Slf4j;
<<<<<<< HEAD
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
=======
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;
>>>>>>> d226f7f56fd0cce29a105cb8ae82842e5318fb1b


@Slf4j
@Controller
public class DemoController {
<<<<<<< HEAD
    private static final Logger log = LoggerFactory.getLogger(DemoController.class);
=======
>>>>>>> d226f7f56fd0cce29a105cb8ae82842e5318fb1b
    private final DemoService demoService;

    @Autowired
    public DemoController(DemoService demoService) {
        this.demoService = demoService;
    }

    @ResponseBody
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
    @GetMapping("welcome")
<<<<<<< HEAD
    public String welcome(@RequestParam String user, @RequestParam int age, Model model) {
        model.addAttribute("helloMessage", demoService.getHelloMessage(user));
        model.addAttribute("age", age);
//        Make sure to setup the Logger factory
=======
    public String welcome(Model model) {
        model.addAttribute("helloMessage", demoService.getHelloMessage("John"));
>>>>>>> d226f7f56fd0cce29a105cb8ae82842e5318fb1b
        log.info("model= {}", model);
        return "welcome";
    }
    @ModelAttribute("welcomeMessage")
    public String welcomeMessage() {
        log.info("welcomeMessage() called");
        return demoService.getWelcomeMessage();
    }
}
