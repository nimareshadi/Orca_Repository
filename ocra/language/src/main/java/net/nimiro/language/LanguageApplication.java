package net.nimiro.language;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class LanguageApplication {

    public static void main(String[] args) {
        SpringApplication.run(LanguageApplication.class, args);
    }

}
