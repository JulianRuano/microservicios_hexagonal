package com.Person.services;

import com.Person.dtos.PersonReqDto;
import com.Person.dtos.PersonRestDto;

public interface IPersonService {
    PersonRestDto createPerson(PersonReqDto personCreateDto);
    PersonRestDto findById(Long id);
}
