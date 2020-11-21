package org.hdxy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    @RequestMapping("/ftl")
    public String ftl(){
        return "index";
    }
}
