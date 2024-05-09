package springproject.jobschedule.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    public long countCourses() {
        return courseRepository.count();
    }

    public List<Course> getCourseByCourseCode(String courseCode){
        return courseRepository.findByCourseCode(courseCode);
    }

    public List<Course> getCourseByCareer(String career){
        return courseRepository.findByCareer(career);
    }

    public Set<Course> getCoursePrerequisites(String courseCode) {
        List<Course> matchedCourses = courseRepository.findByCourseCode(courseCode);
        Set<Course> uniquePrerequisiteCourses = new HashSet<>();
        for (Course course : matchedCourses) {
            List<String> prerequisites = course.getPrerequisites();
            if (prerequisites != null) { // Check for null to avoid NullPointerException
                for (String prerequisiteCode : prerequisites) {
                    List<Course> prerequisiteCourses = courseRepository.findByCourseCode(prerequisiteCode);
                    uniquePrerequisiteCourses.addAll(prerequisiteCourses);
                }
            }
        }
        return uniquePrerequisiteCourses;
    }
    
}
