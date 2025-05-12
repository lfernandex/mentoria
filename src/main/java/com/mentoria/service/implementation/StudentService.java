package com.mentoria.service.implementation;

import com.mentoria.domain.dto.CreateStudentDTO;
import com.mentoria.domain.dto.StudentDTO;
import com.mentoria.domain.entitie.Student;
import com.mentoria.domain.enuns.ErrorEnum;
import com.mentoria.exception.BusinessException;
import com.mentoria.repository.StudentRepository;
import com.mentoria.service.interfaces.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.mentoria.util.BuildUtils.*;

@Service
public class StudentService implements IService<StudentDTO> {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private CourseService courseService;

    @Autowired
    private RoleService roleService;

    @Override
    public StudentDTO findById(Long requestId) {
        try {
            Student student = studentRepository.findById(requestId).orElseThrow();
            return buildStudentDTO(student);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public StudentDTO findByRa(String ra) {
        try {
            Student student = studentRepository.findByStudentRa(ra).orElseThrow();
            return buildStudentDTO(student);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
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

    public CreateStudentDTO createS(CreateStudentDTO request) {

       try {
           saveStudent(getStudent(request));
           courseService.saveCourses(getCourses(request));
           roleService.saveRoles(getRoles(request));
           return request;
       }catch (BusinessException e){
           throw new BusinessException(e.getError());
       }
    }

    @Override
    public StudentDTO update(StudentDTO request, Long requestId) {

        Student existingStudent = studentRepository
                .findById(requestId)
                .orElseThrow(() -> new RuntimeException("Student not found with ID: " + requestId));

        existingStudent.setStudentName(request.getStudentName());
        existingStudent.setStudentEmail(request.getStudentEmail());
        Student updatedStudent = studentRepository.save(existingStudent);
        return buildStudentDTO(updatedStudent);
    }

    @Override
    public void delete(Long id) {
        studentRepository.deleteById(id);
    }

    public void saveStudent(Student request) {
        try{
            studentRepository.save(request);
        }catch (RuntimeException e){
            throw new BusinessException(ErrorEnum.INVALID_STUDENT);
        }
    }
}
