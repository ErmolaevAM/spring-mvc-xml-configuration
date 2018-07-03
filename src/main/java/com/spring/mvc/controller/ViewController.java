package com.spring.mvc.controller;


import com.spring.mvc.model.Topic;
import com.spring.mvc.service.LogService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;

import java.util.UUID;

@Controller
public class ViewController {

    private LogService logService;

    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public ModelAndView welcome() {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("message",  "Hello world!");
        return modelAndView;
    }

    @RequestMapping(value = "/topic", method = RequestMethod.GET)
    public ModelAndView topic() {
        ModelAndView modelAndView = new ModelAndView("topic");
        Topic topic = new Topic();
        topic.setId(UUID.randomUUID());
        topic.setTitle("Java");
        topic.setDescription(logService.log("Hello world!"));
        topic.setOwner("EPAM");
        modelAndView.addObject("topic",  topic);
        return modelAndView;
    }

    public LogService getLogService() {
        return logService;
    }

    public void setLogService(LogService logService) {
        this.logService = logService;
    }
}
