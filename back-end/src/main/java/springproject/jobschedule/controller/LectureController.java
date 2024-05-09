package springproject.jobschedule.controller;
import org.springframework.web.bind.annotation.RestController;

import springproject.jobschedule.model.Lecture;
import springproject.jobschedule.service.LectureService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping("/lecture")
public class LectureController {
    
    @Autowired
    private LectureService lectureService;

    @GetMapping
    public List<Lecture> getAllLectures() {
        return lectureService.getAllLectures();
    }

    @GetMapping("/count")
    public String countLectures() {
        return "Total number of lectures: " + lectureService.countLectures();
    }

    @GetMapping("/course/{courseCode}")
    public List<Lecture> getLectureByCourseCode(@PathVariable String courseCode) {
        return lectureService.getLectureByCourseCode(courseCode);
    }
}
