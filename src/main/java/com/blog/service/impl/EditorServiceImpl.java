package com.blog.service.impl;

import com.blog.entity.BlogEntity;
import com.blog.service.EditorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EditorServiceImpl implements EditorService{
    @Override
    public List<BlogEntity> getBlogPosts(Integer userId) {
        return null;
    }

    @Override
    public void createBlogPost() {

    }

    @Override
    public String previewBlogPost() {
        return null;
    }

    @Override
    public void editBlogPost() {

    }

    @Override
    public void readyToPublish() {

    }
}
