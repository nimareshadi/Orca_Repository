package net.nimiro.words;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.util.List;

@SpringBootApplication
@EnableDiscoveryClient
public class WordsApplication {
    @Autowired
    WordRepository wordRepository;
    public static void main(String[] args) {
        SpringApplication.run(WordsApplication.class, args);

    }
}
