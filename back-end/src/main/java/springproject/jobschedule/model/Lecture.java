package springproject.jobschedule.model;

public class Lecture {
    private Long id;
    private Course course;
    private int identifier;
    private String title;
    private String seeAlso;
    private Topic topic;
    public Lecture(Long id, Course course, int identifier, String title, String seeAlso, Topic topic) {
        this.id = id;
        this.course = course;
        this.identifier = identifier;
        this.title = title;
        this.seeAlso = seeAlso;
        this.topic = topic;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
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
