package com.example.servicea1.controller;

import com.example.servicea1.model.Student;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.HttpEntity;
import org.apache.hc.core5.http.ParseException;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

@RestController
public class A1Controller {

    @GetMapping("/a1/students-b1")
    @ResponseBody
    public List<Student> fetchStudentsFromB1() {
        String urlb1 = "http://localhost:8081/students";
        return fetchStudents(urlb1);
    }

    @GetMapping("/a1/students-b2")
    @ResponseBody
    public List<Student> fetchStudentsFromB2() {
        String urlb2 = "http://localhost:8082/students";
        return fetchStudents(urlb2);
    }

    private List<Student> fetchStudents(String url) {
        List<Student> students = new ArrayList<>();

        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpGet request = new HttpGet(url);
            try (CloseableHttpResponse response = httpClient.execute(request)) {
                HttpEntity entity = response.getEntity();
                if (entity != null) {
                    String result = EntityUtils.toString(entity);
                    students = Arrays.asList(new ObjectMapper().readValue(result, Student[].class));
                }
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return students;
    }
}