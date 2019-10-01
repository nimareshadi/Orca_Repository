package net.nimiro;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "word")
public class WordEntity {

    @Id
    public String id;
    public String code;
    public String words;


    public WordEntity() {
    }

    public WordEntity(String code, String words) {
        this.code = code;
        this.words = words;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }


}


