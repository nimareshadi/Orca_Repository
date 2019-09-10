package net.nimiro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class LanguageProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(LanguageProviderApplication.class, args);
    }
}
