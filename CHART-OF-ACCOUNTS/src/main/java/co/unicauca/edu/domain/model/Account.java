package co.unicauca.edu.domain.model;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Account {
    private Long id;
    private Long tenantId;
    private String code;
    private String name;
}
