package net.nimiro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

@RestController
@SpringBootApplication
@EnableDiscoveryClient
public class LanguageProviderApplication {

  private static Logger log = LoggerFactory.getLogger(LanguageProviderApplication.class);
  @Autowired
  LanguageRepository languageRepository;

  @RequestMapping(value = "/getList")
  public List<LanguageEntity> getList() {
    List<LanguageEntity> languageEntities = languageRepository.findAll();
    return languageEntities;
  }

  @RequestMapping(value = "/")
  public String home() {
    log.info("Access /");
    return "Hi!";
  }

  public static void main(String[] args) {
    SpringApplication.run(LanguageProviderApplication.class, args);
  }
}
