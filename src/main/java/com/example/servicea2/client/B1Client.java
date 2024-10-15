package com.example.servicea2.client;

import com.example.servicea2.model.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "ServiceB1")
public interface B1Client {

    @GetMapping("/students")
    List<Student> getAllStudents();
}
