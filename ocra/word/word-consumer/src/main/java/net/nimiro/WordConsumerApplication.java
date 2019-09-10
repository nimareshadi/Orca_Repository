package net.nimiro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class WordConsumerApplication {
    @Autowired
    WordServiceClient wordServiceClient;

    @RequestMapping(value = "/getWordList/{code}")
    public WordEntity getList(@PathVariable(value = "code") String code) {
        WordEntity wordEntity = wordServiceClient.getList(code);
        return wordEntity;
    }


    public static void main(String[] args) {
        SpringApplication.run(WordConsumerApplication.class, args);
    }

}
