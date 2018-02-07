package com.blog.controller;

import com.blog.model.Blog;
import com.blog.model.User;
import com.blog.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/admin", produces = {MediaType.APPLICATION_JSON_VALUE})
public class AdminController {
    @Autowired
    private AdminService adminService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public List<User> getUserList(){
        return adminService.getEditors();
    }

    @RequestMapping(value = "/{id}" , method = RequestMethod.GET)
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public User getUser(@PathVariable("id") Integer userId){
        return adminService.getEditor(userId);
    }

    @RequestMapping(
            value = "/createUser",
            method = {RequestMethod.POST},
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseStatus(HttpStatus.CREATED)
    public void createEditor(@RequestBody User requestBody){
        adminService.createEditor(requestBody);
    }

    @RequestMapping(
            value = "/editUser/{userId}",
            method = {RequestMethod.PUT},
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseStatus(HttpStatus.OK)
    public void editBlogPost(@RequestBody User requestBody, @PathVariable final Integer userId) {
        adminService.suspendUser(requestBody, userId);
    }

    @RequestMapping(
            value = "/approve/{blogId}",
            method = {RequestMethod.PUT},
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseStatus(HttpStatus.OK)
    public void approveBlogPost(@RequestBody Blog requestBody, @PathVariable final Integer blogId) {
        adminService.approveBlogPost(requestBody, blogId);
    }

    @RequestMapping(
            value = "/reject/{blogId}",
            method = {RequestMethod.PUT},
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseStatus(HttpStatus.OK)
    public void rejectBlogPost(@RequestBody Blog requestBody, @PathVariable final Integer blogId) {
        adminService.rejectBlogPost(requestBody, blogId);
    }

    @RequestMapping(
            value = "/publishDate/{blogId}",
            method = {RequestMethod.PUT},
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseStatus(HttpStatus.OK)
    public void publishDate(@RequestBody Date publishDate, @PathVariable final Integer blogId) {
        adminService.setPublishDate(publishDate, blogId);
    }

}
