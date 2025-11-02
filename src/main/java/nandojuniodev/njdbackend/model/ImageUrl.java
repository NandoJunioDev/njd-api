package nandojuniodev.njdbackend.model;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection="urlimage")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ImageUrl {


    @Id
    private String name;
    private String url;

}
