package org.hdxy.controller;

import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

@RestController

@Api(tags = "描述api接口", description = "描述信息")
public class GuestController {
    @GetMapping("aa")
    @ApiOperation("对接口在方法的具体描述")
    @ApiImplicitParam(name = "name",value = "姓名")
    public String hello() {
        return "aaa";
    }
}
