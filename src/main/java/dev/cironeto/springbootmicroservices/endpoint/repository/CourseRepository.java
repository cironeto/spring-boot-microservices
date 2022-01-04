package dev.cironeto.springbootmicroservices.endpoint.repository;

import dev.cironeto.springbootmicroservices.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
