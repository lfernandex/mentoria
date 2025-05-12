package com.mentoria.controller;

import com.mentoria.domain.dto.LoginDTO;
import com.mentoria.domain.dto.StudentDTO;
import com.mentoria.service.implementation.StudentService;
import com.mentoria.service.jwt.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/login")
public class JwtController {

    @Autowired
    private JwtService jwtService;

    @Autowired
    private StudentService studentService;

    @PostMapping
    public ResponseEntity<?> login(@RequestBody LoginDTO login) {

        StudentDTO student = studentService.findByRa(login.getRa());

        if (Objects.equals(login.getPassword(),student.getStudentPassword())) {
            String token = jwtService.getToken(student.getStudentRa());
            return ResponseEntity.ok().body(Map.of("token", token));
        }

        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
    }
}
