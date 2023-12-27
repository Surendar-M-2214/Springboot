package com.Springboot1.learnjpahibernate.course.jpa;

import org.springframework.stereotype.Repository;

import com.Springboot1.learnjpahibernate.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJpaRepo {
	
	@PersistenceContext
  private EntityManager entityManager;
  
  public void insert(Course course) {
	  entityManager.merge(course);
  }
  
  public Course findById(long id) {
	return  entityManager.find(Course.class, id);
  }
  
  
}
