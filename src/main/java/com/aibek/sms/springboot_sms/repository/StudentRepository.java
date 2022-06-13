package com.aibek.sms.springboot_sms.repository;

import com.aibek.sms.springboot_sms.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
