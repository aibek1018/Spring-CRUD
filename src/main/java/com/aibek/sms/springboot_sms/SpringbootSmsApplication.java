package com.aibek.sms.springboot_sms;

import com.aibek.sms.springboot_sms.entity.Student;
import com.aibek.sms.springboot_sms.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootSmsApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootSmsApplication.class, args);
    }

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {

//        Student student1=new Student("Aibek","Ayazbek","aayazbek1936@gmail.com");
//        studentRepository.save(student1);
//
//        Student student2=new Student("Gaukhar","Nurlybekova","gnurlybekova@gmail.com");
//        studentRepository.save(student2);
//
//        Student student3=new Student("Marat","Ashabaev","mara@gmail.com");
//        studentRepository.save(student3);



    }
}
