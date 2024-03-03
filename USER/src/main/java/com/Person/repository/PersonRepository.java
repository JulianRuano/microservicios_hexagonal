package com.Person.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Person.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{
    
}
