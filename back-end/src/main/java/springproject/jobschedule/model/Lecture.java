package springproject.jobschedule.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("lecture")
public class Lecture {

    @Id
    private String id;

    @Field("CourseId")
    private Integer courseId;

    @Field("Identifier")
    private int identifier;

    @Field("Title")
    private String title;

    @Field("seeAlso")
    private String seeAlso;

    @Field("Topic")
    private String topic;

    public Lecture(String id, Integer courseId, int identifier, String title, String seeAlso, String topic) {
        this.id = id;
        this.courseId = courseId;
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

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
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

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
