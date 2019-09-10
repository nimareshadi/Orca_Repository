package net.nimiro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WordClientController {
    @Autowired
    WordServiceClient wordServiceClient;

    @RequestMapping(value = "/fetchWords/{code}")
    public WordEntity fetchWords(@PathVariable(value = "code") String code) {
        WordEntity wordEntity = wordServiceClient.getWords(code);
        return wordEntity;
    }
}
