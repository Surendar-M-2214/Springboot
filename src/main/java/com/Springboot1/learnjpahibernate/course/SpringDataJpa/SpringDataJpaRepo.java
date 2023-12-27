package com.Springboot1.learnjpahibernate.course.SpringDataJpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Springboot1.learnjpahibernate.course.Course;
import com.Springboot1.learnjpahibernate.course.jdbc.CourseRepo;

public interface SpringDataJpaRepo extends JpaRepository<Course,Long> {
List<Course> findByName(String course);
}
