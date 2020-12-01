package org.hdxy.controller;

import org.hdxy.pojo.Guest;
import org.hdxy.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/guest")
public class GuestController {
    @Autowired
    private GuestService guestService;
    @Transactional
    @GetMapping
    public String getAll(Model model) {
        List<Guest> all = guestService.getAll();
        model.addAttribute("guestList",all);
        return "index";
    }
}
