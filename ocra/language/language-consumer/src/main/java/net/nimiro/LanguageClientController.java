package net.nimiro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LanguageClientController {
    @Autowired
    LanguageServiceClient languageServiceClient;


    @RequestMapping(value = "/fetchLanguages")
    public List<LanguageEntity> getLanguages() {
        return  languageServiceClient.getLanguages();
    }

    @RequestMapping(value = "/fetchLanguage/{id}")
    public LanguageEntity getLanguage(@PathVariable String id) {
        return  languageServiceClient.getLanguage(id);
    }



}
