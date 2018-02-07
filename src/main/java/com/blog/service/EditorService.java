package com.blog.service;

import com.blog.entity.BlogEntity;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EditorService {
    List<BlogEntity> getBlogPosts(Integer userId);
    void createBlogPost();
    String previewBlogPost();
    void editBlogPost();
    void readyToPublish();
}
