package com.gasparbarancelli.mysqlflyway.repository;

import com.gasparbarancelli.mysqlflyway.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag, Long> {
}
