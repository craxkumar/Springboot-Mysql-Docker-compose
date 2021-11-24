package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.model.Student;

@RepositoryRestResource(collectionResourceRel="students",path="student")
public interface StudentDao extends JpaRepository<Student,Integer> {

}
