package com.practice.hibernateDemo.repositories;

import com.practice.hibernateDemo.models.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Integer> {

}
