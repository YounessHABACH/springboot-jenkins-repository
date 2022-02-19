package ynshb.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDockerMavenApplication {


    /*
     * run this on cmd
     * docker run --tty --publish 8080:8080 docker image
     */
    @GetMapping("/hello")
    public String displayHello(){
        return "Hello Docker - in Jenkins";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDockerMavenApplication.class, args);
    }

}
