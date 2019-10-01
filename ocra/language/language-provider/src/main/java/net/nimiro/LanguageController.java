package net.nimiro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class LanguageController {
    @Autowired
    LanguageRepository languageRepository;

    @RequestMapping(value = "/languages")
    public List<LanguageEntity> getLanguages() {
        List<LanguageEntity> languageEntities = languageRepository.findAll();
        return languageEntities;
    }

    @RequestMapping(value = "/languages/{id}")
    public LanguageEntity getLanguage(@PathVariable String id) {
        Optional<LanguageEntity> languageEntity = languageRepository.findById(id);
        if(languageEntity != null){
            return languageEntity.get();
        }
       return null;
    }

}
