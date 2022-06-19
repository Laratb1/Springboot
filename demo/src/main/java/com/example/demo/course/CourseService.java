package com.example.demo.course;

import java.util.List;
//import com.example.demo.course.Course;

import org.springframework.stereotype.Service;

@Service
public class CourseService {
    public List<Course> getCourses() {
		return List.of(
			new Course(
				1L,
				"Direito",
				124
			)
		);
	}
}
