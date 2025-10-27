package nandojuniodev.njdbackend.convert;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {

    UsuarioResponseDto paraUsuarioResponseDto(UsuarioEntity usuarioEntity);
}
