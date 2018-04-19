package com.jeiker.wechat.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
@Slf4j
public class HelloController {

    @GetMapping("/")
    public Map<String, String> hello() {
        return Collections.singletonMap("message", "Hello World!");
    }
}
