package com.authentication.system.user.domain.models;

import java.util.Set;

import com.authentication.system.user.infrastructure.adapters.output.jpaAdapter.Entity.role.UserRole;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class User {
    
    private Long id;
	private String username;
	private String password;
	private String name;
	private String email;
	private String cellPhone;
    private boolean enabled;
    private String profile;

    private Set<UserRole> userRoles;
}
