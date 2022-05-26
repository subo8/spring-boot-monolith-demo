package com.sa.miniproject1.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

    @Id
    private Integer id;
    private String firstName;
    private String lastName;
    private Double GPA;
    private Integer DOB;

    public Student() {
    }

    public Student(Integer id, String firstName, String lastName, Double gPA, Integer dob) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.GPA = gPA;
        this.DOB = dob;
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

    public Integer getDOB() {
        return DOB;
    }

    public void setDOB(Integer dob) {
        this.DOB = dob;
    }

    @Override
    public String toString() {
        return "Student [GPA=" + GPA + ", DOB=" + DOB + ", firstName=" + firstName + ", id=" + id + ", lastName="
                + lastName + "]";
    }
}
