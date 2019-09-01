package net.nimiro.language;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "language")
public class LanguageEntity {

    @Id
    public String id;
    public String code;
    public String port;
    public String name;


    public LanguageEntity() {
    }

    public LanguageEntity(String code, String port, String name) {
        this.code = code;
        this.port = port;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private class Word {
        public String key;
        public String value;
    }


}


