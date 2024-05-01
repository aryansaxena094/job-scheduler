package springproject.jobschedule.model;

public class Topic {
    private Long id;
    private Course course;
    private String type;
    private Integer identifier;
    private String name;
    private String link;
    private String entity_type;
    public Topic(Long id, Course course, String type, Integer identifier, String name, String link,
            String entity_type) {
        this.id = id;
        this.course = course;
        this.type = type;
        this.identifier = identifier;
        this.name = name;
        this.link = link;
        this.entity_type = entity_type;
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
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public Integer getIdentifier() {
        return identifier;
    }
    public void setIdentifier(Integer identifier) {
        this.identifier = identifier;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLink() {
        return link;
    }
    public void setLink(String link) {
        this.link = link;
    }
    public String getEntity_type() {
        return entity_type;
    }
    public void setEntity_type(String entity_type) {
        this.entity_type = entity_type;
    }
}
