package net.nimiro;



public class LanguageEntity {


    public String id;
    public String code;
    public String name;


    public LanguageEntity() {
    }

    public LanguageEntity(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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


