package com.Springboot1.learnjpahibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.Springboot1.learnjpahibernate.course.Course;
import com.Springboot1.learnjpahibernate.course.SpringDataJpa.SpringDataJpaRepo;
import com.Springboot1.learnjpahibernate.course.jpa.CourseJpaRepo;

@Component
public class CourseCommandRunner implements CommandLineRunner{
//  @Autowired
//	private CourseRepo repo;

//	@Autowired
//	private CourseJpaRepo repo;
	@Autowired
	private SpringDataJpaRepo repo;
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repo.save(new Course(1,"Sql","Suray" ));
		repo.save(new Course(2,"JAVA","Vicky" ));
		repo.save(new Course(3,"C++","Lenin" ));
		repo.save(new Course(4,"Python","Kama" ));
		repo.save(new Course(5,"C","Hari" ));
		repo.deleteById(2l);
		System.out.println(repo.findById(3l));
		System.out.println(repo.findById(4l));
		System.out.println(repo.count());
		System.out.println(repo.findAll());
		System.out.println(repo.findByName("c"));
		
		
	}
	
	

}
