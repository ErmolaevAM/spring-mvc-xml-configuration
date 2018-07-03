package com.spring.mvc.service.impl;

import com.spring.mvc.service.LogService;

public class LogServiceImpl implements LogService {
    public String log(String msg) {
        String message = "LOG: "+msg;
        System.out.println(message);
        return message;
    }
}
