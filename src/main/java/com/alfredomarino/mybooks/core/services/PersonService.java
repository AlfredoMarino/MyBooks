package com.alfredomarino.mybooks.core.services;

import com.alfredomarino.mybooks.core.model.Person;

import java.util.List;

public interface PersonService {

    Person findById(Long personId);

    boolean existsById(Long idPerson);

    List<Person> findAllByNameOrLastname(String name, String lastname);

    Person create(Person person);
}
