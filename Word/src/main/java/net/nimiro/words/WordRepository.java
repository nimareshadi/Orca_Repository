package net.nimiro.words;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface WordRepository extends MongoRepository<WordEntity, String> {
    public WordEntity findByCode(String code);
}
