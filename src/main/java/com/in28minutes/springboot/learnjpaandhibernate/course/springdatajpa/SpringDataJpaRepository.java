package com.in28minutes.springboot.learnjpaandhibernate.course.springdatajpa;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SpringDataJpaRepository extends JpaRepository<Course,Long> {
    List<Course> findByAuthor(String author);
    List<Course> findByName(String name);
}
