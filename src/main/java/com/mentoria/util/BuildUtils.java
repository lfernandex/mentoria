package com.mentoria.util;

import com.mentoria.domain.dto.CourseDTO;
import com.mentoria.domain.dto.CreateStudentDTO;
import com.mentoria.domain.dto.RoleDTO;
import com.mentoria.domain.dto.StudentDTO;
import com.mentoria.domain.entitie.Course;
import com.mentoria.domain.entitie.Role;
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
                .build();
    }


    public static Student buildStudent(StudentDTO studentDTO) {
        return Student.builder()
                .studentName(studentDTO.getStudentName())
                .studentRa(studentDTO.getStudentRa())
                .studentEmail(studentDTO.getStudentEmail())
                .studentPassword(studentDTO.getStudentPassword())
                .build();
    }

    public static Student getStudent(CreateStudentDTO request) {
        return Student.builder()
                .studentName(request.getStudent().getStudentName())
                .studentRa(request.getStudent().getStudentRa())
                .studentEmail(request.getStudent().getStudentEmail())
                .studentPassword(request.getStudent().getStudentPassword())
                .build();
    }

    public static List<Course> getCourses(CreateStudentDTO request) {
        return request.getCourses().
                stream().
                map(BuildUtils::buildCourse).toList();
    }

    public static List<Role> getRoles(CreateStudentDTO request){
        return request.getRoles()
                .stream()
                .map(BuildUtils::getRole)
                .toList();
    }

    public static Course buildCourse(CourseDTO request) {
        return Course.builder()
                .courseName(request.getCourseName())
                .build();
    }

    public static Role getRole(RoleDTO request) {
        return Role.builder()
                .roleName(request.getRoleName())
                .build();
    }
}
