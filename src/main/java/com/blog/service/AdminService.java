package com.blog.service;

import com.blog.model.Blog;
import com.blog.model.User;

import java.util.Date;
import java.util.List;

public interface AdminService {
    List<User> getEditors();
    User getEditor(Integer userId);
    void createEditor(User editor);
    void suspendUser(User editor, Integer userId);
    void approveBlogPost(Blog blogPost, Integer blogId);
    void rejectBlogPost(Blog blogPost, Integer blogId);
    Date setPublishDate(Date publishToDate, Integer blogId);
}
