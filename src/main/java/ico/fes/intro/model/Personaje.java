package ico.fes.intro.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;

import java.io.Serializable;

@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Personaje implements Serializable {
    private Integer id;
    private String name;
    private String status;
    private String species;
    private String gender;
    private String image;
}
