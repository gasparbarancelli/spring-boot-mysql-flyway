package com.gasparbarancelli.mysqlflyway.repository;

import com.gasparbarancelli.mysqlflyway.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
