package com.sa.miniproject1.model;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Table(name="student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstName;
    private String lastName;
    private Double GPA;
    @Transient
    private Integer age;
    private LocalDate DOB;

    public Student() {
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate dob) {
        this.DOB = dob;
    }

    public Student(Integer id, String firstName, String lastName, Double gPA, Integer age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.GPA = gPA;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getGPA() {
        return GPA;
    }

    public void setGPA(Double gPA) {
        this.GPA = gPA;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [GPA=" + GPA + ", age=" + age + ", firstName=" + firstName + ", id=" + id + ", lastName="
                + lastName + "]";
    }
}
