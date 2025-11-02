package nandojuniodev.njdbackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nandojuniodev.njdbackend.dtos.RequestDto;
import nandojuniodev.njdbackend.dtos.ResponseDto;
import nandojuniodev.njdbackend.mapper.MapperUsuario;
import nandojuniodev.njdbackend.model.EntityUser;
import nandojuniodev.njdbackend.repository.UserRepository;

@Service
public class UserService {


    @Autowired
    private UserRepository userRepository;
    
    private MapperUsuario mapper;

public UserService(MapperUsuario mapper) {
        this.mapper = mapper;
    }

    public ResponseDto criarUsuario(RequestDto dto){
        EntityUser novoUser = mapper.toEntity(dto);
        try{
            EntityUser userSalvo = userRepository.save(novoUser);

            ResponseDto responseDto = mapper.toDto(userSalvo);
            
            return responseDto;
            

        }catch(Exception e){
            //tatar erro
            throw new RuntimeException("Erro ao criar usuario");
        }
        finally{
            //codigo que sempre sera executado
            
        }
    }

    public List<EntityUser> obterTodosUsuarios() {
        return userRepository.findAll();
    }
    
    public  ResponseDto atualizarUsuario(Long id, RequestDto dto){
        EntityUser userExistente = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuario nao encontrado"));

        userExistente.setName(dto.name());
        userExistente.setEmail(dto.email());
        userExistente.setCpf(dto.cpf());

        EntityUser userAtualizado = userRepository.save(userExistente);
        return mapper.toDto(userAtualizado);
    }
}
