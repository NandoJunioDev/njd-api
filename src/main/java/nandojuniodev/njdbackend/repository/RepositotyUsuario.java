package nandojuniodev.njdbackend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import nandojuniodev.njdbackend.infrastructure.entity.UsuarioEntity;

public interface RepositotyUsuario extends MongoRepository<UsuarioEntity, String> {

}
