package nandojuniodev.njdbackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nandojuniodev.njdbackend.model.EntityUser;
import nandojuniodev.njdbackend.repository.UserRepository;

@Service
public class UserService {


    @Autowired
    private UserRepository userRepository;

    public EntityUser salvarUsuario(EntityUser user) {
        return userRepository.save(user);
    }

    public List<EntityUser> obterTodosUsuarios() {
        return userRepository.findAll();
    }
    
}
