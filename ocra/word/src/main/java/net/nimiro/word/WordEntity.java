package net.nimiro.word;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "word")
public class WordEntity {
    @Id
    public String id;
    public String code;
    public List<Word> list;

    public WordEntity() {
    }

    public WordEntity(String id, String code, List<Word> list) {
        this.id = id;
        this.code = code;
        this.list = list;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Word> getList() {
        return list;
    }

    public void setList(List<Word> list) {
        this.list = list;
    }

    private class Word {
        public String key;
        public String value;
    }


}
