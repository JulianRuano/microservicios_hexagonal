package com.Person.mapper;

import com.Person.dtos.PersonReqDto;
import com.Person.model.Person;

public interface IPersonReqMapper {
    
    Person toPerson(PersonReqDto personCreateDto);
}
