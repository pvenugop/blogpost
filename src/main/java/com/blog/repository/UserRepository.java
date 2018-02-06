package com.blog.repository;

import com.blog.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends CrudRepository<UserEntity, Long> {

}
