package nandojuniodev.njdbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

    // rota para atualizar um usario existente
    @PutMapping("/users/{id}") 
    

    // ResponseEntity para retornar a resposta HTTP, ResponseDto(destino da solicitaçao, ou seja na entidade user), @RequestBody para indicar que o corpo da solicitaçao contem os dados do usuario, requestDto dto (objeto que contem os dados do usuario a serem atualizados), @PathVariable Long id (id do usuario a ser atualizado)
    public ResponseEntity<ResponseDto> atualizarUsuario(@PathVariable Long id, @RequestBody RequestDto dto){

        // Responsedto para onde vai a resposta da atualizaçao do usuario, usamos o service para chamar o metodo de atualizaçao do usuario, passando o id e o dto como parametros, dto na qual é dto de requestDto a origim e dos dados a serem atualizados
        ResponseDto usuarioAtualizado = userService.atualizarUsuario(id, dto);
        // retornamos a resposta com o usuario atualizado e o status OK
        return ResponseEntity.ok(usuarioAtualizado);

     } 
    
}
