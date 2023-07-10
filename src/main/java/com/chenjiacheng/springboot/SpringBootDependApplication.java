package com.chenjiacheng.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * create by chenjiacheng on 2023/7/10 08:54
 *
 * @author chenjiacheng
 * @since 1.0.0
 */

@SpringBootApplication
public class SpringBootDependApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootDependApplication.class, args);
    }

}