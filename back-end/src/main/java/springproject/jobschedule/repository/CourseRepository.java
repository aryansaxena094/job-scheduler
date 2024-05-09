package springproject.jobschedule.repository;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import springproject.jobschedule.model.Course;

@Repository
public interface CourseRepository extends MongoRepository<Course, String> {
    List<Course> findByCourseCode(String courseCode);
    List<Course> findByCareer(String career);
}
