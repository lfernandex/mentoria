package com.mentoria.util;

import com.mentoria.domain.dto.StudentDTO;
import com.mentoria.domain.entitie.Student;

import java.util.ArrayList;
import java.util.List;

public class BuildUtilsTest {

    public static List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(getStudent());
        return students;
    }


    public static Student getStudent(){
        return Student.builder()
                .studentId(1L)
                .studentEmail("email")
                .studentName("name")
                .build();
    }

    public static StudentDTO getStudentDTO(){
        return StudentDTO.builder()
                .studentName("name")
                .studentEmail("email")
                .build();
    }
}
