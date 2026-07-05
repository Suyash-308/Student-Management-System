package com.suyash.jwtauthapplication.controller;

import com.suyash.jwtauthapplication.entity.Student;
import com.suyash.jwtauthapplication.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/student")
public class StudentController {
    private final StudentService studentService;

    @PostMapping("/add")
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable int id) {
        return studentService.getStudentById(id);
    }

    @PutMapping("/{id}")
    public Student updateStudent(@RequestBody Student student ,@PathVariable long id){
        return studentService.updateStudent(id,student);
    }

    @GetMapping
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }

    @DeleteMapping
    public void deleteAllStudent(){
        studentService.deleteAllStudent();
    }

}
