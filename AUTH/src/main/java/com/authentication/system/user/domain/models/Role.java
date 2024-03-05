package com.authentication.system.user.domain.models;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Role {
    private Long rolId;
    private String rolName;

    private Set<UserRole> userRoles;
}
