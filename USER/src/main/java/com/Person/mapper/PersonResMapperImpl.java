package com.Person.mapper;

import org.springframework.stereotype.Component;

import com.Person.dtos.PersonRestDto;
import com.Person.model.Person;

@Component
public class PersonResMapperImpl implements IPersonResMapper{

    @Override
    public PersonRestDto toPersonResponseDto(Person person) {
        if (person == null) {
            return null;
        }
        return PersonRestDto.builder()
            .id(person.getId())
            .name(person.getName())
            .email(person.getEmail())
            .build();
    }
    
    
}
