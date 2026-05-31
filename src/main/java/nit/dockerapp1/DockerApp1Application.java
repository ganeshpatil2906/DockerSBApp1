package nit.dockerapp1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerApp1Application {

    public static void main(String[] args) {
        SpringApplication.run(DockerApp1Application.class, args);
        System.out.println("Welcome to spring boor application");
    }

}
