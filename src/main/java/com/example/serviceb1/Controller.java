package com.example.serviceb1;

import com.example.serviceb1.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class Controller {

    @GetMapping("/students")
    public List<Student> getStudents() {
        return Arrays.asList(
                new Student("Nguyen Van A", 20, "Hanoi"),
                new Student("Tran Thi B", 22, "Ho Chi Minh City")
        );
    }
}