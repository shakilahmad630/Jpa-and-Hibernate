package com.in28minutes.springboot.learnjpaandhibernate.course.springdatajpa;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class CourseSpringDataJpaCommandLineRunner implements CommandLineRunner {


    @Autowired
    private SpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
         repository.save(new Course(1,"Learn Azure","in28minutes"));
        repository.save(new Course(2,"Learn AWS","in28minutes"));
        repository.save(new Course(3,"Learn DevOps","in28minutes"));

        repository.deleteById(2l);

        System.out.println(repository.findById(1l));
        System.out.println(repository.findByAuthor("in28minutes"));
        System.out.println(repository.findByAuthor(""));
        System.out.println(repository.findByName("Learn Azure"));
        System.out.println(repository.findByName("Learn AWS"));
    }
}
