package nandojuniodev.njdbackend.mapper;

import org.mapstruct.Mapper;

import nandojuniodev.njdbackend.dtos.RequestDto;
import nandojuniodev.njdbackend.dtos.ResponseDto;
import nandojuniodev.njdbackend.model.EntityUser;

@Mapper(componentModel = "spring")
public interface MapperUsuario  {



    // pega de dto e transforma em entity, Entityuser ( Destino) é tabela do banco de dados sql,  o que está no paramentro é origem 
    EntityUser toEntity(RequestDto dto);


    
    ResponseDto toDto(EntityUser entity);

}
