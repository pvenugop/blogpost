package com.blog.controller;

import com.blog.entity.BlogEntity;
import com.blog.service.EditorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/editor", produces = {MediaType.APPLICATION_JSON_VALUE})
public class EditorController {

    @Autowired
    private EditorService editorService;

    @RequestMapping(
            value = "/create",
            method = {RequestMethod.POST},
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseStatus(HttpStatus.CREATED)
    public void createBlogPost(@RequestBody BlogEntity requestBody){

    }

    @RequestMapping(
            value = "/edit/{blogId}",
            method = {RequestMethod.PUT},
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseStatus(HttpStatus.OK)
    public void editBlogPost(@RequestBody BlogEntity requestBody, @PathVariable final Integer blogId){

    }

}
