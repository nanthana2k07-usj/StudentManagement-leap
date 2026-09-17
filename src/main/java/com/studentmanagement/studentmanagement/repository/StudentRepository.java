package com.studentmanagement.studentmanagement.repository;

import com.studentmanagement.studentmanagement.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}