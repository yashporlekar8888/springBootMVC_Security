package com.example.springbootmvcsecurity.repository;

import com.example.springbootmvcsecurity.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
