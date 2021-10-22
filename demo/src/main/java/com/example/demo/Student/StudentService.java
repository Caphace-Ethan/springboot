package com.example.demo.Student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents(){
        Student student = new Student(
                1,
                "Ethani Caphace",
                "ethani.kitilah@eganet.go.tz",
                LocalDate.of(2000, 2, 01)
        );

        return List.of(
                student
        );
    }

}
