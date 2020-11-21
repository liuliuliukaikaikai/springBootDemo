package org.hdxy.controller;

import org.jasypt.util.text.BasicTextEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Value("${info.username}")
    private String username;

    @RequestMapping("encrybt")
    public String encrybt() {
        String a = username;
        return a;
    }
}
