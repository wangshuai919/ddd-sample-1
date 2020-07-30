package com.demo.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@ResponseBody
@ControllerAdvice
public class DemoControllerAdvice {

    @ExceptionHandler
    public Map errorHandler(Exception ex) {
        Map map = new HashMap();
        map.put("code", 99999);
        map.put("message", ex.getMessage());
        return map;
    }
}
