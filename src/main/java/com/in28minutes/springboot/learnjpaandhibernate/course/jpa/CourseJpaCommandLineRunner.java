package com.in28minutes.springboot.learnjpaandhibernate.course.jpa;


import com.in28minutes.springboot.learnjpaandhibernate.course.springdatajpa.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class CourseJpaCommandLineRunner implements CommandLineRunner {


    @Autowired
    private CourseJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
         repository.insert(new Course(1,"Learn Azure","in28minutes"));
        repository.insert(new Course(2,"Learn AWS","in28minutes"));
        repository.insert(new Course(3,"Learn DevOps","in28minutes"));

        repository.deleteById(2);

        System.out.println(repository.findById(1));
    }
}
