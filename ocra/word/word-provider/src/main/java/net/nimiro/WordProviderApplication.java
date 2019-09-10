package net.nimiro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@SpringBootApplication
@EnableDiscoveryClient
public class WordProviderApplication {

    private static Logger log = LoggerFactory.getLogger(WordProviderApplication.class);
    @Autowired
    WordRepository wordRepository;

    @RequestMapping(value = "/getList/{code}")
    public WordEntity getList(@PathVariable(value = "code") String code) {
        WordEntity wordEntity = wordRepository.findByCode(code);
        return wordEntity;
    }

    @RequestMapping(value = "/")
    public String home() {
        log.info("Access /");
        return "Hi!";
    }

    public static void main(String[] args) {
        SpringApplication.run(WordProviderApplication.class, args);
    }
}
