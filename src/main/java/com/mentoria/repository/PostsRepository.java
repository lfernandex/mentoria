package com.mentoria.repository;

import com.mentoria.domain.entitie.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> {
}
