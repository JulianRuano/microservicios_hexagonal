package com.Person.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Person.dtos.PersonReqDto;
import com.Person.dtos.PersonRestDto;
import com.Person.services.IPersonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private IPersonService personService;

    @PostMapping("/")
    public ResponseEntity<PersonRestDto> createPerson(@RequestBody  PersonReqDto personDto) {
        return ResponseEntity.ok(personService.createPerson(personDto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<PersonRestDto> findById(@RequestParam Long id) {
        return ResponseEntity.ok(personService.findById(id));
    }

    @GetMapping("/")
    public String hello() {
        return "Hello";
    }
}
