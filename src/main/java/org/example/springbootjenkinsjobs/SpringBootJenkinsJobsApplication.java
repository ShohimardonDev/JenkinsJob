package org.example.springbootjenkinsjobs;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log4j2
public class SpringBootJenkinsJobsApplication implements CommandLineRunner {

    public static void main(String[] args) {
        log.info("its a continuous integration job ");
        SpringApplication.run(SpringBootJenkinsJobsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("it is second logger")
    }
}
