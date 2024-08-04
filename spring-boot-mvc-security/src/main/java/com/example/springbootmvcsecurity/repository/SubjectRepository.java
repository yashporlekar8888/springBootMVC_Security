package com.example.springbootmvcsecurity.repository;

import com.example.springbootmvcsecurity.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, Long> {
}
