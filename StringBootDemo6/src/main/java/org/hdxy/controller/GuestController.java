package org.hdxy.controller;

import org.hdxy.pojo.Guest;
import org.hdxy.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/guest")
public class GuestController {
    @Autowired
    private GuestService guestService;


    //返回嘉宾列表页
//    @RequestMapping(method = RequestMethod.GET)
    @GetMapping
    public String list(Model model) {
        List<Guest> list = guestService.list();
        model.addAttribute("guestList", list);
        return "index";
    }

    //跳转增加嘉宾页面
    @GetMapping("/toadd")
    public String toadd() {
        return "add";
    }
    //增加嘉宾
    @PostMapping
    public String add(Guest guest) {
        guestService.add(guest);
        return "redirect:/guest";
    }

    //跳转修改嘉宾页面
    @GetMapping("/toupdate/{name}")
    public String toupdate(Model model,@PathVariable("name") String name) {
        Guest guest = guestService.get(name);
        model.addAttribute(guest);
        return "update";
    }

    //修改嘉宾
    @PutMapping
    public String update(Guest guest) {
        guestService.update(guest);
        return "redirect:/guest";
    }
    //删除嘉宾
    @DeleteMapping("/{name}")
    public String delete(@PathVariable("name") String name) {
        guestService.delete(name);
        return "redirect:/guest";
    }
}
