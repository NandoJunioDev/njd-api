package nandojuniodev.njdbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import nandojuniodev.njdbackend.dtos.RequestDto;
import nandojuniodev.njdbackend.dtos.ResponseDto;
import nandojuniodev.njdbackend.model.EntityUser;
import nandojuniodev.njdbackend.service.UserService;

@RestController("/")
public class usercontroller {


    @Autowired
    private UserService userService;

    @PostMapping("/users")
    public ResponseEntity<ResponseDto> criarUsuario(@RequestBody RequestDto user )
    {
        ResponseDto novoUsuario = userService.criarUsuario(user);
        return new ResponseEntity<>(novoUsuario, HttpStatus.CREATED);
    }
    @GetMapping("/users")
    public ResponseEntity<List<EntityUser>> listarUsuarios()
    {
        List<EntityUser> usuarios = userService.obterTodosUsuarios();
        return ResponseEntity.ok(usuarios);
    }
    
    
    
}
