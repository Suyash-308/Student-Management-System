package com.suyash.jwtauthapplication.service;

import com.suyash.jwtauthapplication.entity.Student;
import com.suyash.jwtauthapplication.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
}
