package nandojuniodev.njdbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import nandojuniodev.njdbackend.model.EntityUser;
@Repository

public interface UserRepository extends JpaRepository<EntityUser, Long> {

}
