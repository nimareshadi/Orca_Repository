package net.nimiro;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "language-provider")
public interface LanguageServiceClient {

    @RequestMapping(value = "/languages", method = RequestMethod.GET)
    public List< LanguageEntity > getLanguages();

    @RequestMapping(value = "/languages/{id}", method = RequestMethod.GET)
    public LanguageEntity  getLanguage(@PathVariable String id);

}
