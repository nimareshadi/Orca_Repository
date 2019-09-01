package net.nimiro.language;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LanguageController {
    @Autowired
    LanguageRepository languageRepository;

    @Autowired
    private Environment environment;

    @RequestMapping(value = "/getlanguages", method = {RequestMethod.GET})
    @ResponseBody
    public List<LanguageEntity> getEnList() {
        List<LanguageEntity> languageEntities = languageRepository.findAll();
        return languageEntities;

    }
}
