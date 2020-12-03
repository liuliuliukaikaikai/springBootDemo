package org.hdxy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.*;
import javax.servlet.http.HttpFilter;
import java.io.IOException;

@RestController
public class GuestController {
    @GetMapping("hello")
    public String hello() {
        return "success";
    }
}
