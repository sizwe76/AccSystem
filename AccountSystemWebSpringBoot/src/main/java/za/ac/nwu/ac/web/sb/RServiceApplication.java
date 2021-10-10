package za.ac.nwu.ac.web.sb;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@SpringBootApplication
public class RServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RServiceApplication.class, args);
    }

}
