package net.nimiro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@RestController
@RibbonClient(name = "language-provider", configuration = LanguageProviderConfiguration.class)
public class LanguageServiceApplication {

  @LoadBalanced
  @Bean
  RestTemplate restTemplate(){
    return new RestTemplate();
  }

  @Autowired
  RestTemplate restTemplate;

  @RequestMapping("/getLanguageList")
  public String getLanguageList() {
    String response = this.restTemplate.getForObject("http://language-provider/getList", String.class);
    return response;
  }

  public static void main(String[] args) {
    SpringApplication.run(LanguageServiceApplication.class, args);
  }
}

