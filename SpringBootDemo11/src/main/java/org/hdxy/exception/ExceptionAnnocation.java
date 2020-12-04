package org.hdxy.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ExceptionAnnocation {
    @ExceptionHandler(Exception.class)
    public ModelAndView hadler(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("no404");
        return modelAndView;
    }
}
