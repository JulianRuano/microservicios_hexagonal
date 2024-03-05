package com.authentication.system.user.infrastructure.adapters.output.jpaAdapter.Entity.role;

import com.authentication.system.user.infrastructure.adapters.output.jpaAdapter.Entity.user.UserEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class UserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userRoleId;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.EAGER)
    private UserEntity user;

    @ManyToOne
    private Role role;

    

}
