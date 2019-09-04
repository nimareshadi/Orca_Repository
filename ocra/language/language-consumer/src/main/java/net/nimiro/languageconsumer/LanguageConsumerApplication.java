package net.nimiro.languageconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class LanguageConsumerApplication {
    @Autowired
    LanguageServiceClient languageServiceClient;

    @RequestMapping(value = "/getLanguageList")
    public List<LanguageEntity> getList() {
        return  languageServiceClient.getList();
    }


    public static void main(String[] args) {
        SpringApplication.run(LanguageConsumerApplication.class, args);
    }

}
