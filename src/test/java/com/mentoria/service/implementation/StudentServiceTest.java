package com.mentoria.service.implementation;

import com.mentoria.domain.dto.StudentDTO;
import com.mentoria.domain.entitie.Student;
import com.mentoria.repository.StudentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.List;
import java.util.Optional;

import static com.mentoria.util.BuildUtilsTest.*;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

class StudentServiceTest {

    @InjectMocks
    private StudentService studentService;

    @Mock
    private StudentRepository studentRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void findById() {
        when(studentRepository.findById(any())).thenReturn(Optional.ofNullable(mock(Student.class)));
        StudentDTO student = studentService.findById(any());
        assertNotNull(student);
    }

    @Test
    void findByIdWithError() {
        when(studentRepository.findById(any())).thenThrow(NullPointerException.class);
        assertThatExceptionOfType(RuntimeException.class)
                .isThrownBy(() -> studentService.findById(1L));
    }

    @Test
    void findByRa() {
        when(studentRepository.findByStudentRa(any())).thenReturn(Optional.ofNullable(mock(Student.class)));
        StudentDTO student = studentService.findByRa(any());
        assertNotNull(student);
    }

    @Test
    void findByRaWithError() {
        when(studentRepository.findByStudentRa(any())).thenThrow(NullPointerException.class);
        assertThatExceptionOfType(RuntimeException.class)
                .isThrownBy(() -> studentService.findByRa("1"));
    }

    @Test
    void findAll() {
        when(studentRepository.findAll()).thenReturn(getStudents());
        List<StudentDTO> listStudent = studentService.findAll();
        assertNotNull(listStudent);
    }

    @Test
    void create() {
        when(studentRepository.save(any(Student.class))).thenReturn(getStudent());
        StudentDTO student = studentService.create(getStudentDTO());
        assertNotNull(student);
    }

    @Test
    void update() {
        when(studentRepository.findById(1L)).thenReturn(Optional.ofNullable(getStudent()));
        when(studentRepository.save(getStudent())).thenReturn(getStudent());
        StudentDTO student = studentService.update(getStudentDTO(), 1L);
        assertNotNull(student);
    }

    @Test
    void delete() {
        when(studentRepository.findById(1L))
                .thenReturn(Optional.of(getStudent()));

        studentService.delete(1L);

        Mockito.verify(studentRepository, Mockito.times(1)).
                deleteById(1L);
    }
}