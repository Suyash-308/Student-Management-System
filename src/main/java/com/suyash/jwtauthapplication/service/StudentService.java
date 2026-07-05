package com.suyash.jwtauthapplication.service;

import com.suyash.jwtauthapplication.entity.Student;
import com.suyash.jwtauthapplication.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }


    public Student getStudentById(@PathVariable  long id) {
        return studentRepository.findById(id).orElseThrow(() -> new RuntimeException("Student not found with id: " + id));
    }

    public Student updateStudent(long id, Student student) {
        Student student1=studentRepository.findById(id).orElseThrow(()->new RuntimeException("student not found with id"+id));

        student1.setName(student.getName());
        student1.setEmail(student.getEmail());
        student1.setCourse(student.getCourse());

        return  studentRepository.save(student1);
    }

    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    public void deleteById(long id) {
        studentRepository.deleteById(id);
    }

    public void deleteAllStudent() {
        studentRepository.deleteAll();
    }
}
