package com.est.student.service;

import com.est.student.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService
{
    void addStudent(Student student);
    List<Student> getAllStudents();
    Optional<Student> getStudentById(long id);
    void updateStudent(Student student);
    void deleteStudent(long id);

}
