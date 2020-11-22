package org.hdxy.controller;

import org.hdxy.pojo.Guest;
import org.hdxy.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class GuestController {
    @Autowired
    private GuestService guestService;


    //返回嘉宾列表页
    @RequestMapping("/guest/list")
    public String list(Model model) {
        List<Guest> list = guestService.list();
        model.addAttribute("guestList", list);
        return "index";
    }

    //跳转增加嘉宾页面
    @RequestMapping("/guest/toadd")
    public String toadd() {
        return "add";
    }

    //增加嘉宾
    @RequestMapping("/guest/add")
    public String add(Guest guest) {
        guestService.add(guest);
        return "redirect:/guest/list";
    }

    //跳转修改嘉宾页面
    @RequestMapping("/guest/toupdate")
    public String toupdate(Model model, String name) {
        Guest guest = guestService.get(name);
        model.addAttribute(guest);
        return "update";
    }

    //修改嘉宾
    @RequestMapping("/guest/update")
    public String update(Guest guest) {
        guestService.update(guest);
        return "redirect:/guest/list";
    }
    //删除嘉宾
    @RequestMapping("/guest/delete")
    public String delete(String name) {
        guestService.delete(name);
        return "redirect:/guest/list";
    }
}
