package com.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(value = "/")
public class BlogController {

    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public String welcome() {
//        model.put("message", "HelloWorld");
        return "welcome";
    }

}
