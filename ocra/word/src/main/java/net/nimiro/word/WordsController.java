package net.nimiro.word;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class WordsController {


    @Autowired
    WordRepository wordRepository;


    @RequestMapping(value = "/getwords", method = {RequestMethod.GET})
    @ResponseBody
    public WordEntity getEnList(@RequestParam(value = "code", defaultValue = "") String code) {
        List<WordEntity> wordEntities = wordRepository.findAll();
        WordEntity wordEntity = wordRepository.findByCode(code);
        return wordEntity;

    }
}
