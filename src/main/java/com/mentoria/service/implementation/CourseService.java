package com.mentoria.service.implementation;

import com.mentoria.domain.entitie.Course;
import com.mentoria.domain.enuns.ErrorEnum;
import com.mentoria.exception.BusinessException;
import com.mentoria.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public void saveCourses(List<Course> request) {
        try{
            courseRepository.saveAll(request);
        }catch (RuntimeException e){
            throw new BusinessException(ErrorEnum.NULL_COURSE_LIST);
        }
    }

}
