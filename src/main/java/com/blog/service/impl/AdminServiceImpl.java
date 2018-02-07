package com.blog.service.impl;

import com.blog.model.Blog;
import com.blog.model.User;
import com.blog.service.AdminService;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class AdminServiceImpl implements AdminService{
    @Override
    public List<User> getEditors() {
        return null;
    }

    @Override
    public User getEditor(Integer userId) {
        return null;
    }

    @Override
    public void createEditor(User editor) {

    }

    @Override
    public void suspendUser(User editor, Integer userId) {

    }

    @Override
    public void approveBlogPost(Blog blogPost, Integer blogId) {

    }

    @Override
    public void rejectBlogPost(Blog blogPost, Integer blogId) {

    }

    @Override
    public Date setPublishDate(Date publishToDate, Integer blogId) {
        return null;
    }
}
