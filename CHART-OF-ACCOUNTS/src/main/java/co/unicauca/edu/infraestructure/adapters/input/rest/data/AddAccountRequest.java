package co.unicauca.edu.infraestructure.adapters.input.rest.data;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class AddAccountRequest {
    private String code;
    private String name;
}
