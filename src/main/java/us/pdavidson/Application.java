package us.pdavidson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

@SpringBootApplication
@EnableZuulServer
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    
}
