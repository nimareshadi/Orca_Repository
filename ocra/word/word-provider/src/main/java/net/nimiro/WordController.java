package net.nimiro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WordController {

    @Autowired
    WordRepository wordRepository;

    @RequestMapping(value = "/words/{code}")
    public WordEntity getWords(@PathVariable(value = "code") String code) {
        WordEntity wordEntity = wordRepository.findByCode(code);
        return wordEntity;
    }

}
