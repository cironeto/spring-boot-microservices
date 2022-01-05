package dev.cironeto.core.repository;

import dev.cironeto.core.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
