package com.example.demo.course;

import java.util.List;
import com.example.demo.course.Course;

import org.springframework.stereotype.Service;

@Service
public class CourseService {

	private final CourseRepository courseRepository;

	@Autowired
    public List<Course> getCourses() {
		return courseRepository.findALl();
}
