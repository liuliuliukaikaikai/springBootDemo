package org.hdxy.controller;

import org.hdxy.config.FootConfig;
import org.hdxy.config.VegetablesConfig;
import org.hdxy.pojo.Foot;
import org.hdxy.pojo.Vegetables;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
//    @Value("${foot.rice}")
//    String rice;
//    @Value("${foot.meat}")
//    String meat;

    @RequestMapping("hello")
    public String hello() {
        return "hello,word";
    }
    @Autowired
    FootConfig config;
    @Autowired
    VegetablesConfig vegetablesConfig;
    @RequestMapping("foot")
    public Foot foot() {
        Foot foot = new Foot();
        foot.setRice(config.getRice());
        foot.setMeat(config.getMeat());
        foot.setSauce(config.getSauce());
        return foot;
    }
    @RequestMapping("vegetables")
    public Vegetables vegetables() {
        Vegetables vegetables = new Vegetables();
        vegetables.setPotato(vegetablesConfig.getPotato());
        vegetables.setEggplant(vegetablesConfig.getEggplant());
        vegetables.setGreenpeper(vegetablesConfig.getGreenpeper());
        return vegetables;
    }
}
