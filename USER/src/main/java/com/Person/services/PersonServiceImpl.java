package com.Person.services;

import org.springframework.stereotype.Service;

import com.Person.dtos.PersonReqDto;
import com.Person.dtos.PersonRestDto;
import com.Person.mapper.IPersonReqMapper;
import com.Person.mapper.IPersonResMapper;
import com.Person.model.Person;
import com.Person.repository.PersonRepository;

import jakarta.transaction.Transactional;
import lombok.NonNull;

@Service
@Transactional
public class PersonServiceImpl implements IPersonService{

    private PersonRepository personRepository;
    private final IPersonResMapper personResMapper;
    private final IPersonReqMapper personReqMapper;

    public PersonServiceImpl(PersonRepository personRepository, IPersonResMapper personResMapper, IPersonReqMapper personReqMapper) {
        this.personRepository = personRepository;
        this.personResMapper = personResMapper;
        this.personReqMapper = personReqMapper;
    }

    @Override
    public PersonRestDto createPerson(PersonReqDto personCreateDto) {
        Person person = new Person();
        person = personReqMapper.toPerson(personCreateDto);
        if(person == null) return null;

        return personResMapper.toPersonResponseDto(personRepository.save(person));  
    }

    @Override
    public PersonRestDto findById(@NonNull Long id) {
        Person person = personRepository.findById(id).orElse(null);
        return personResMapper.toPersonResponseDto(person);
    }

  

    
}
