package com.example.assignment;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<student,Long>{
    student findById(int id);
    }

