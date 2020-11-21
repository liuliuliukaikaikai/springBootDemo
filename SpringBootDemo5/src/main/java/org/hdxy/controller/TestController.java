package org.hdxy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    @RequestMapping("html")
    public String html(Model model){
        model.addAttribute("html","hello,world");
        return "index";
    }
    @RequestMapping("/welcome")
    public String welcome(Model model){
        model.addAttribute("html","hello,world");
        return "welcome";
    }
}
