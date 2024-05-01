package springproject.jobschedule.model;

import java.util.List;

public class Course {
    private Long id;
    private Integer course_id;
    private String title;
    private Integer credits;
    private String component;
    private String component_description;
    private String career;
    private String course_code;
    private List<Course> prerequisites;
    private List<Course> never_taken;
    private List<Course> equivalent_courses;
    public Course(Long id, Integer course_id, String title, Integer credits, String component,
            String component_description, String career, String course_code, List<Course> prerequisites,
            List<Course> never_taken, List<Course> equivalent_courses) {
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
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
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
    public List<Course> getPrerequisites() {
        return prerequisites;
    }
    public void setPrerequisites(List<Course> prerequisites) {
        this.prerequisites = prerequisites;
    }
    public List<Course> getNever_taken() {
        return never_taken;
    }
    public void setNever_taken(List<Course> never_taken) {
        this.never_taken = never_taken;
    }
    public List<Course> getEquivalent_courses() {
        return equivalent_courses;
    }
    public void setEquivalent_courses(List<Course> equivalent_courses) {
        this.equivalent_courses = equivalent_courses;
    }
}
