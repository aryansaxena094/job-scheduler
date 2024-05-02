package springproject.jobschedule.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("courses")
public class Course {
    @Id
    private String id;
    private Integer course_id;
    private String title;
    private Integer credits;
    private String component;
    private String component_description;
    private String career;
    private String course_code;
    private List<String> prerequisites;
    private List<String> never_taken;
    private List<String> equivalent_courses;
    public Course(String id, Integer course_id, String title, Integer credits, String component,
            String component_description, String career, String course_code, List<String> prerequisites,
            List<String> never_taken, List<String> equivalent_courses) {
        this.id = id;
        this.course_id = course_id;
        this.title = title;
        this.credits = credits;
        this.component = component;
        this.component_description = component_description;
        this.career = career;
        this.course_code = course_code;
        this.prerequisites = prerequisites;
        this.never_taken = never_taken;
        this.equivalent_courses = equivalent_courses;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Integer getCourse_id() {
        return course_id;
    }
    public void setCourse_id(Integer course_id) {
        this.course_id = course_id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Integer getCredits() {
        return credits;
    }
    public void setCredits(Integer credits) {
        this.credits = credits;
    }
    public String getComponent() {
        return component;
    }
    public void setComponent(String component) {
        this.component = component;
    }
    public String getComponent_description() {
        return component_description;
    }
    public void setComponent_description(String component_description) {
        this.component_description = component_description;
    }
    public String getCareer() {
        return career;
    }
    public void setCareer(String career) {
        this.career = career;
    }
    public String getCourse_code() {
        return course_code;
    }
    public void setCourse_code(String course_code) {
        this.course_code = course_code;
    }
    public List<String> getPrerequisites() {
        return prerequisites;
    }
    public void setPrerequisites(List<String> prerequisites) {
        this.prerequisites = prerequisites;
    }
    public List<String> getNever_taken() {
        return never_taken;
    }
    public void setNever_taken(List<String> never_taken) {
        this.never_taken = never_taken;
    }
    public List<String> getEquivalent_courses() {
        return equivalent_courses;
    }
    public void setEquivalent_courses(List<String> equivalent_courses) {
        this.equivalent_courses = equivalent_courses;
    }
}
