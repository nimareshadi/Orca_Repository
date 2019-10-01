package net.nimiro;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "word-provider")
public interface WordServiceClient {

    @RequestMapping(value = "/words/{code}")
    public WordEntity getWords(@PathVariable(value = "code") String code);


}
