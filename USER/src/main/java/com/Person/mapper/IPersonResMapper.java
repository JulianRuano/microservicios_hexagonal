package com.Person.mapper;

import com.Person.dtos.PersonRestDto;
import com.Person.model.Person;

public interface IPersonResMapper {
    
    PersonRestDto toPersonResponseDto(Person person);
}
