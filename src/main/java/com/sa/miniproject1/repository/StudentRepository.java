package com.sa.miniproject1.repository;

import com.sa.miniproject1.model.Student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
