package springproject.jobschedule.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("lecture")
public class Lecture {
    @Id
    private String id;
    private Course course;
    private int identifier;
    private String title;
    private String seeAlso;
    private Topic topic;
    public Lecture(String id, Course course, int identifier, String title, String seeAlso, Topic topic) {
        this.id = id;
        this.course = course;
        this.identifier = identifier;
        this.title = title;
        this.seeAlso = seeAlso;
        this.topic = topic;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Course getCourse() {
        return course;
    }
    public void setCourse(Course course) {
        this.course = course;
    }
    public int getIdentifier() {
        return identifier;
    }
    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getSeeAlso() {
        return seeAlso;
    }
    public void setSeeAlso(String seeAlso) {
        this.seeAlso = seeAlso;
    }
    public Topic getTopic() {
        return topic;
    }
    public void setTopic(Topic topic) {
        this.topic = topic;
    }
}
