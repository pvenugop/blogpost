package com.blog.repository;

import com.blog.entity.UserEntity;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Integer> {

    @Modifying
    @Query("update UserEntity u set u.status = ?1 where u.id = ?2")
    int setUserStatus(String userStatus , Integer userId);

}
