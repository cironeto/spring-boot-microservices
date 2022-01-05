package dev.cironeto.springbootmicroservices.endpoint.service;

import dev.cironeto.core.model.Course;
import dev.cironeto.core.repository.CourseRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public Page<Course> listAll (Pageable pageable) {
        log.info("Listing all courses");
        return courseRepository.findAll(pageable);
    }
}
