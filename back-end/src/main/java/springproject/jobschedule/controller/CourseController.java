package springproject.jobschedule.controller;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springproject.jobschedule.model.Course;
import springproject.jobschedule.service.CourseService;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/courses")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }
    
    @GetMapping("/count")
    public String countCourses() {
        return "Total number of courses: " + courseService.countCourses();
    }

    @GetMapping("/{courseCode}")
    public List<Course> getCourseByCourseCode(@PathVariable String courseCode) {
        return courseService.getCourseByCourseCode(courseCode);
    }

    @GetMapping("/career/{career}")
    public List<Course> getCourseByCareer(@PathVariable String career){
        return courseService.getCourseByCareer(career);
    }

    @GetMapping("/{courseCode}/preRequisites")
    public Set<Course> getCoursePrerequisites(@PathVariable String courseCode){
        return courseService.getCoursePrerequisites(courseCode);
    }
}
