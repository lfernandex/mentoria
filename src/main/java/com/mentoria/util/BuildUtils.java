package com.mentoria.util;

import com.mentoria.domain.dto.StudentDTO;
import com.mentoria.domain.entitie.Student;

import java.util.List;

public class BuildUtils {


    public static List<StudentDTO> buildListStudentDTO(List<Student> studentList) {
     return studentList.stream().map(BuildUtils::buildStudentDTO).toList();
    }

    public static StudentDTO buildStudentDTO(Student student) {
        return StudentDTO.builder()
                .studentName(student.getStudentName())
                .studentRa(student.getStudentRa())
                .studentEmail(student.getStudentEmail())
                .studentPassword(student.getStudentPassword())
                .studentCourses(student.getStudentCourses())
                .studentRoles(student.getStudentRoles())
                .studentPosts(student.getStudentPosts())
                .build();
    }


    public static Student buildStudent(StudentDTO studentDTO) {
        return Student.builder()
                .studentName(studentDTO.getStudentName())
                .studentRa(studentDTO.getStudentRa())
                .studentEmail(studentDTO.getStudentEmail())
                .studentPassword(studentDTO.getStudentPassword())
                .studentCourses(studentDTO.getStudentCourses())
                .studentRoles(studentDTO.getStudentRoles())
                .studentPosts(studentDTO.getStudentPosts())
                .build();
    }
}
