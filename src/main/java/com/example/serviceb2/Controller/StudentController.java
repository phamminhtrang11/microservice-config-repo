package com.example.serviceb2.Controller;

import com.example.serviceb2.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class StudentController {

    @GetMapping("/students")
    public List<Student> getStudents() {
        return Arrays.asList(
                new Student("Le Van C", 21, "Da Nang"),
                new Student("Pham Thi D", 23, "Hai Phong")
        );
    }
}
