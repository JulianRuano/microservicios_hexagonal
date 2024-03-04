package co.unicauca.edu.infraestructure.adapters.input.rest.data;


import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
public class AddAccountRequest {
    private String code;
    private String name;
}
