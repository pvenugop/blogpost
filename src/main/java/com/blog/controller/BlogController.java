package com.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class BlogController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String welcome() {
//        model.put("message", "HelloWorld");
        return "welcome";
    }

}
