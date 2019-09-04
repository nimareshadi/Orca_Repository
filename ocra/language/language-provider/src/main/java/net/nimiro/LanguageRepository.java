package net.nimiro;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface LanguageRepository extends MongoRepository<LanguageEntity, String> {

}
