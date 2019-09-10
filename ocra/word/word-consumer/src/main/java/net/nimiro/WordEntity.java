package net.nimiro;


import java.util.List;


public class WordEntity {


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


