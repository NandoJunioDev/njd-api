package nandojuniodev.njdbackend.infrastructure.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "enderecos_entity")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Enderecos {
    @Id
    private String id;
    private String usuarioId;
    private String rua;
    private String cidade;
    private String estado;
    private String cep;

}
