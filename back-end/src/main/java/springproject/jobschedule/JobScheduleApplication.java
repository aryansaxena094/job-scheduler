package springproject.jobschedule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class JobScheduleApplication {

    public static void main(String[] args) {
        SpringApplication.run(JobScheduleApplication.class, args);
    }
}
