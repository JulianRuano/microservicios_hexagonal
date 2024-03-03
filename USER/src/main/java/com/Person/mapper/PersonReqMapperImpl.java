package com.Person.mapper;

import org.springframework.stereotype.Component;

import com.Person.dtos.PersonReqDto;
import com.Person.model.Person;

@Component
public class PersonReqMapperImpl implements IPersonReqMapper{

    @Override
    public Person toPerson(PersonReqDto personCreateDto) {
        if (personCreateDto == null) {
            return null;
        }
        return Person.builder()
            .name(personCreateDto.getName())
            .email(personCreateDto.getEmail())
            .password(personCreateDto.getPassword())        
            .build();
    }
    
}
