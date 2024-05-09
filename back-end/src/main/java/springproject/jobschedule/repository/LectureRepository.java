package springproject.jobschedule.repository;
import org.springframework.stereotype.Repository;
import springproject.jobschedule.model.Lecture;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface LectureRepository extends MongoRepository<Lecture, String> {
    List<Lecture> findByCourseId(Integer course_id);
}
