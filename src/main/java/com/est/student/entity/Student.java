package com.est.student.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "student_details")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Student
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String email;
}
