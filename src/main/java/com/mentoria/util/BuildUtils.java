package com.mentoria.util;

import com.mentoria.domain.dto.ClassSemesterDTO;
import com.mentoria.domain.dto.StudentDTO;
import com.mentoria.domain.entitie.ClassSemester;
import com.mentoria.domain.entitie.Student;

import java.util.List;

public class BuildUtils {

    public static List<Student> buildListStudent(List<StudentDTO> studentDTOList) {
        return studentDTOList.stream().map(BuildUtils::buildStudent).toList();
    }

    public static List<StudentDTO> buildListStudentDTO(List<Student> studentList) {
     return studentList.stream().map(BuildUtils::buildStudentDTO).toList();
    }

    public static StudentDTO buildStudentDTO(Student student) {
        return StudentDTO.builder()
                .name(student.getName())
                .ra(student.getRa())
                .email(student.getEmail())
                .password(student.getPassword())
                .classSemester(buildClassSemesterDTO(student.getClassSemesters()))
                .build();
    }

    public static List<ClassSemesterDTO> buildClassSemesterDTO(List<ClassSemester> ListClassSemester) {
        return ListClassSemester
                .stream()
                .map(classSemester -> ClassSemesterDTO.builder().build())
                .toList();
    }

    public static Student buildStudent(StudentDTO studentDTO) {
        return Student.builder()
                .name(studentDTO.getName())
                .ra(studentDTO.getRa())
                .email(studentDTO.getEmail())
                .password(studentDTO.getPassword())
                .classSemesters(buildClassSemester(studentDTO.getClassSemester()))
                .build();
    }

    public static List<ClassSemester> buildClassSemester(List<ClassSemesterDTO> classSemesterDTOList) {
        return classSemesterDTOList
                .stream()
                .map(classSemesterDTO -> ClassSemester.builder().build())
                .toList();
    }
}
