package springproject.jobschedule.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springproject.jobschedule.model.Course;
import springproject.jobschedule.repository.CourseRepository;

@Service
public class CourseService {
    
    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public Course getCoursesById(String id) {
        return courseRepository.findById(id).orElse(null);
    }
}
