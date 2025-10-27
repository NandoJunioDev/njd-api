package nandojuniodev.njdbackend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import nandojuniodev.njdbackend.infrastructure.entity.Enderecos;

public interface RepositoryEndereco extends MongoRepository<Enderecos, String> {

}
