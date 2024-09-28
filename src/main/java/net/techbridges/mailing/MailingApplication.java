package net.techbridges.mailing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.thymeleaf.ThymeleafAutoConfiguration;

@SpringBootApplication(exclude = { ThymeleafAutoConfiguration.class })
public class MailingApplication {

    public static void main(String[] args) {
        SpringApplication.run(MailingApplication.class, args);
    }

}
