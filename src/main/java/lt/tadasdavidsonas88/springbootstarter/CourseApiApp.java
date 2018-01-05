package lt.tadasdavidsonas88.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication      // tells it is the starting point of the Spring Boot application
public class CourseApiApp {

    public static void main(String[] args) {
        SpringApplication.run(CourseApiApp.class, args);
    }
}
