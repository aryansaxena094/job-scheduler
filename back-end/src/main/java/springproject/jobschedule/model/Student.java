package springproject.jobschedule.model;
import java.util.HashMap;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("students")
public class Student {
    @Id
    private String id;
    private String first_name;
    private String last_name;
    private String email;
    private transient Long password;
    private String id_number;
    private boolean enrolled;
    private HashMap<String, Grade> courses;
    public Student(String id, String first_name, String last_name, String email, Long password, String id_number,
            boolean enrolled, HashMap<String, Grade> courses) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.password = password;
        this.id_number = id_number;
        this.enrolled = enrolled;
        this.courses = courses;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getFirst_name() {
        return first_name;
    }
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    public String getLast_name() {
        return last_name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Long getPassword() {
        return password;
    }
    public void setPassword(Long password) {
        this.password = password;
    }
    public String getId_number() {
        return id_number;
    }
    public void setId_number(String id_number) {
        this.id_number = id_number;
    }
    public boolean isEnrolled() {
        return enrolled;
    }
    public void setEnrolled(boolean enrolled) {
        this.enrolled = enrolled;
    }
    public HashMap<String, Grade> getStrings() {
        return courses;
    }
    public void setStrings(HashMap<String, Grade> courses) {
        this.courses = courses;
    }
}
