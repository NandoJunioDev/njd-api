package nandojuniodev.njdbackend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import nandojuniodev.njdbackend.model.ImageUrl;

public interface UrlRepository extends MongoRepository<ImageUrl, String>  {

}
