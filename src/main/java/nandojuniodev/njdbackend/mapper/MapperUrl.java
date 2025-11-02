package nandojuniodev.njdbackend.mapper;

import org.mapstruct.Mapper;

import nandojuniodev.njdbackend.dtos.RequestDtoUrl;
import nandojuniodev.njdbackend.dtos.ResponseDtoUrl;
import nandojuniodev.njdbackend.model.ImageUrl;

@Mapper(componentModel="spring")
public interface MapperUrl {

    ImageUrl toEntity (RequestDtoUrl dto );


    ResponseDtoUrl toDto ( ImageUrl Entity);


    

}
