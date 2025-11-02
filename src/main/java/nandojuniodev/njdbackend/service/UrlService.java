package nandojuniodev.njdbackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nandojuniodev.njdbackend.dtos.RequestDtoUrl;
import nandojuniodev.njdbackend.dtos.ResponseDtoUrl;

import nandojuniodev.njdbackend.mapper.MapperUrl;
import nandojuniodev.njdbackend.model.ImageUrl;
import nandojuniodev.njdbackend.repository.UrlRepository;

@Service
public class UrlService {


    @Autowired
    UrlRepository urlrepository;

    MapperUrl mapper;

    public UrlService ( MapperUrl mapper) {
        this.mapper = mapper;
    }
    


    public ResponseDtoUrl  criarRegistro (RequestDtoUrl dto ){
        
        ImageUrl novaUrl = mapper.toEntity(dto);
        try{
            ImageUrl urlSalva = urlrepository.save(novaUrl);

            ResponseDtoUrl responseDtoUrl = mapper.toDto(urlSalva);
            
            return responseDtoUrl;
        } catch (Exception e) {
            // Tratar exceções adequadamente
            throw new RuntimeException("Erro ao criar registro de URL");
        }
    }

    public  List<ImageUrl> obterTodosRegistros() {
        return urlrepository.findAll();
    }


}
