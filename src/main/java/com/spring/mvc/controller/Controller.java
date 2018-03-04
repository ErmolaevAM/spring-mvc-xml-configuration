package com.spring.mvc.controller;


import com.spring.mvc.model.Topic;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.UUID;

@org.springframework.stereotype.Controller
public class Controller {

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
        topic.setDescription("Java lessons for SSU students.");
        topic.setOwner("EPAM");
        modelAndView.addObject("topic",  topic);
        return modelAndView;
    }



}
