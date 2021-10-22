package com.example.demo.Student;

import java.time.LocalDate;

public class Student {
    private long id;
    private String name;
    private String email;
    private LocalDate dateOfBirth;

//    Creating 3 Constructors

    public Student() {
    }


    public Student(long id,
                   String name,
                   String email,
                   LocalDate dateOfBirth) {

        this.id = id;
        this.name = name;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }

    public Student(String name,
                   String email,
                   LocalDate dateOfBirth) {

        this.name = name;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }

    //    Setting up the Setters
    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

//    Setting up the Getters
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

//    toString

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
