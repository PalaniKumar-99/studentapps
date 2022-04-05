package com.est.student.controller;

import com.est.student.entity.Student;
import com.est.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController
{
    @Autowired
    private StudentService studentService;

    @PostMapping("/addStudent")
    public void addStudent(@RequestBody Student student)
    {
        studentService.addStudent(student);
    }
    @GetMapping("/getAllStudents")
    public List<Student> getAllStudents(@RequestBody  Student student)
    {
       return studentService.getAllStudents();
    }

    @GetMapping("/getStudentById/{id}")
    public Optional<Student> getStudentById(@PathVariable long id)
    {
       return studentService.getStudentById(id);
    }
    @PutMapping("/updateStudent/{id}")
    public void updateStudent(@PathVariable long id,@RequestBody Student student)
    {
        studentService.updateStudent(student);
    }
    @DeleteMapping("/deleteStudent/{id}")
    public void deleteStudent(@PathVariable long id)
    {
        studentService.deleteStudent(id);
    }
}
