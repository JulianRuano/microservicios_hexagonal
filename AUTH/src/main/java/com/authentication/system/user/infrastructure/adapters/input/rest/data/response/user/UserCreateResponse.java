package com.authentication.system.user.infrastructure.adapters.input.rest.data.response.user;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserCreateResponse {
    private Long id;
    private String name;
    private String email; 
}
