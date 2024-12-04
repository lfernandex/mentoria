package com.mentoria.service.implementation;

import com.mentoria.domain.dto.StudentDTO;
import com.mentoria.domain.entitie.Student;
import com.mentoria.repository.StudentRepository;
import com.mentoria.service.interfaces.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.mentoria.util.BuildUtils.*;

@Service
public class StudentService implements IService<StudentDTO, Long> {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public StudentDTO findById(Long requestId) {
        return buildStudentDTO(studentRepository.findById(requestId).orElseThrow());
    }

    @Override
    public List<StudentDTO> findAll() {
        return buildListStudentDTO(studentRepository.findAll());
    }

    @Override
    public StudentDTO create(StudentDTO request) {
        studentRepository.save(buildStudent(request));

        return request;
    }

    @Override
    public StudentDTO update(StudentDTO request, Long requestId) {

        Student existingStudent = studentRepository
                .findById(requestId)
                .orElseThrow(() -> new RuntimeException("Student not found with ID: " + requestId));

        existingStudent.setName(request.getName());
        existingStudent.setEmail(request.getEmail());
        Student updatedStudent = studentRepository.save(existingStudent);

        return buildStudentDTO(updatedStudent);
    }

    @Override
    public void delete(Long id) {
        studentRepository.deleteById(id);
    }
}
