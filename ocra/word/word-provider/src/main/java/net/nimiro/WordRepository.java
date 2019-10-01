package net.nimiro;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface WordRepository extends MongoRepository<WordEntity, String> {
    public WordEntity findByCode(String code);
}
