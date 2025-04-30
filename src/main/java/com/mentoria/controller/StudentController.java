package com.mentoria.controller;

import com.mentoria.domain.dto.StudentDTO;
import com.mentoria.service.implementation.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/all")
    public ResponseEntity<List<StudentDTO>> findAll() {
        return ResponseEntity.ok().body(studentService.findAll());
    }

    @GetMapping("/byId/{studentId}")
    public ResponseEntity<StudentDTO> findById(@PathVariable Long studentId) {
        return ResponseEntity.ok().body(studentService.findById(studentId));
    }

    @PostMapping("/create")
    public ResponseEntity<StudentDTO> create(@RequestBody StudentDTO studentDTO) {
        return ResponseEntity.ok().body(studentService.create(studentDTO));
    }

    @PatchMapping("/update/{studentId}")
    public ResponseEntity<StudentDTO> update(@RequestBody StudentDTO studentDTO, @PathVariable Long studentId) {
        return ResponseEntity.ok().body(studentService.update(studentDTO, studentId));
    }

    @DeleteMapping("/{studentId}")
    public ResponseEntity<Void> delete(@PathVariable Long studentId) {
        studentService.delete(studentId);
        return ResponseEntity.noContent().build();
    }

}
