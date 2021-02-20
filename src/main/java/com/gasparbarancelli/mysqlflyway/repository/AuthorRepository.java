package com.gasparbarancelli.mysqlflyway.repository;

import com.gasparbarancelli.mysqlflyway.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
