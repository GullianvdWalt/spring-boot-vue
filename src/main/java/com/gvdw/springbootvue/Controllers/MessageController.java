package com.gvdw.springbootvue.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created By Gullian on Mar, 2021
 */

@RestController
@RequestMapping("/api/messages")
public class MessageController {

    @GetMapping("/hello")
    public String hello(){
        return "Spring Boot With Vue.js, FROM Spring..Controller!";
    }
}
