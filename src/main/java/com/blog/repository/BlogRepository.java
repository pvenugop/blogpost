package com.blog.repository;

import com.blog.entity.BlogEntity;
import com.blog.helper.BlogStatus;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends CrudRepository<BlogEntity, Integer>{

    @Modifying
    @Query("update BlogEntity u set u.status = ?1 where u.blog_id = ?2")
    int setBlogStatus(String blogStatus , Integer blogId);
}
