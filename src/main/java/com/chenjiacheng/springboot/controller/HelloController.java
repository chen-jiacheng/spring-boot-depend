package com.chenjiacheng.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * create by chenjiacheng on 2023/7/10 09:04
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
@RestController
@RequestMapping("/")
public class HelloController {

    @GetMapping
    public String hello() {
        return "hello springboot.";
    }
}
