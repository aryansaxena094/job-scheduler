package springproject.jobschedule.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springproject.jobschedule.model.Lecture;
import springproject.jobschedule.repository.CourseRepository;
import springproject.jobschedule.repository.LectureRepository;

@Service
public class LectureService {
    
    @Autowired
    private LectureRepository lectureRepository;

    @Autowired
    private CourseRepository courseRepository;

    public List<Lecture> getAllLectures() {
        return lectureRepository.findAll();
    }

    public long countLectures() {
        return lectureRepository.count();
    }

    public List<Lecture> getLectureByCourseCode(String courseCode){
        System.out.println("Course code: " + courseCode);
        Integer course_id = courseRepository.findByCourseCode(courseCode).get(0).getCourse_id();
        return lectureRepository.findByCourseId(course_id);
    }
}