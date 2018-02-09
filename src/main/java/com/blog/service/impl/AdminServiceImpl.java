package com.blog.service.impl;

import com.blog.entity.UserEntity;
import com.blog.helper.BlogStatus;
import com.blog.helper.UserStatus;
import com.blog.model.Blog;
import com.blog.model.User;
import com.blog.repository.BlogRepository;
import com.blog.repository.UserRepository;
import com.blog.service.AdminService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.dozer.DozerBeanMapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AdminServiceImpl implements AdminService{

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private BlogRepository blogRepository;


    ModelMapper modelMapper= new ModelMapper();

//    DozerBeanMapper dozzerMapper = new DozerBeanMapper();
//    Gson gson = new GsonBuilder().setPrettyPrinting()
//            .excludeFieldsWithoutExposeAnnotation()
//            .serializeNulls()
//            .disableHtmlEscaping().create();

    @Override
    public List<User> getEditors() {
        List<UserEntity> userEntities = (List<UserEntity>) userRepository.findAll();
        return userEntities.stream().map(userEntity -> convertToDto(userEntity)).collect(Collectors.toList());
    }

    @Override
    public User getEditor(Integer userId) {
        return convertToDto(userRepository.findById(userId).get());
    }

    @Override
    public void createEditor(User editor) {
        userRepository.save(convertToEntity(editor));
    }

    @Override
    public void suspendUser(User editor, Integer userId) {
        userRepository.setUserStatus(UserStatus.SUSPENDED.name(), userId);
    }

    @Override
    public void approveBlogPost(Blog blogPost, Integer blogId) {
        blogRepository.setBlogStatus(BlogStatus.PUBLISHED.name(), blogId);
    }

    @Override
    public void rejectBlogPost(Blog blogPost, Integer blogId) {
        blogRepository.setBlogStatus(BlogStatus.PUBLISHED.name(), blogId);
    }

    @Override
    public Date setPublishDate(Date publishToDate, Integer blogId) {
        return null;
    }

    private User convertToDto(UserEntity userEntity){
        return modelMapper.map(userEntity, User.class);
    }

    private UserEntity convertToEntity(User user){
        return modelMapper.map(user, UserEntity.class);
    }
}
