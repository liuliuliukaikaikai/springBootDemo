package org.hdxy.controller;

import org.hdxy.exception.MyException;
import org.hdxy.pojo.Guest;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;
import java.util.List;
import java.util.Properties;

@RestController
public class TestController {
    @GetMapping("/guest")
    public String success(@Valid Guest guest, BindingResult result){
        if (result.getErrorCount()>0){
            List<FieldError> fieldErrors = result.getFieldErrors();
            for (FieldError fieldError : fieldErrors){
                System.out.println(fieldError.getField());
                System.out.println(fieldError.getDefaultMessage());
            }
        }

        return "success";
    }
    @GetMapping("/guests")
    public String successs(){
        try{
            int i = 1/0;
        }catch (Exception e){
        throw new MyException("错误");
        }
        return "success";
    }
}
