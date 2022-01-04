package dev.cironeto.springbootmicroservices.endpoint.controller;

import dev.cironeto.springbootmicroservices.endpoint.service.CourseService;
import dev.cironeto.springbootmicroservices.model.Course;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/admin/course")
@Slf4j
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping
    public ResponseEntity<Page<Course>> listAll(Pageable pageable) {
        return ResponseEntity.ok(courseService.listAll(pageable));
    }
}
