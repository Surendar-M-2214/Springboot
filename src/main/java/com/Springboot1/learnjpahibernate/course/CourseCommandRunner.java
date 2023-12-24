package com.Springboot1.learnjpahibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.Springboot1.learnjpahibernate.course.Course;
import com.Springboot1.learnjpahibernate.course.jpa.CourseJpaRepo;

@Component
public class CourseCommandRunner implements CommandLineRunner{
//  @Autowired
//	private CourseRepo repo;

	@Autowired
	private CourseJpaRepo repo;
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repo.insert(new Course(1,"Sql","Suray" ));
		repo.insert(new Course(2,"JAVA","Vicky" ));
		repo.insert(new Course(3,"C++","Lenin" ));
		repo.insert(new Course(4,"Python","Kama" ));
		repo.insert(new Course(5,"C","Hari" ));
//		repo.delete(2);
		System.out.println(repo.findId(3));
		System.out.println(repo.findId(4));
	}
	
	

}
