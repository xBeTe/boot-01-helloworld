package com.j2ee.springboot.controller;

import com.j2ee.springboot.bean.Car;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xzxie
 * @create 2022/9/20 17:33
 */

//@ResponseBody
//@Controller
@RestController
@Slf4j
public class HelloController {

    @Autowired
    Car car;

    @RequestMapping("/car")
    public  Car car() {
        return car;
    }

    @RequestMapping("/hello")
    public String handle01() {
        log.info("Requesting...");
        return "Hello, Spring Boot 2!" + "你好！" + "Ctrl+F9 --> reBuild";
    }
}
