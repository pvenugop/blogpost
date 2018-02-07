package com.blog.repository;

import com.blog.entity.BlogEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends CrudRepository<BlogEntity, Long>{

}
