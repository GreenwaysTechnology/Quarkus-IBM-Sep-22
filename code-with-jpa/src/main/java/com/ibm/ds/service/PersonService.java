package com.ibm.ds.service;


import com.ibm.ds.model.Person;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@ApplicationScoped
public class PersonService {
    public List<Person> findAll() {
        return Person.listAll();
    }

    @Transactional
    public String createPerson(Person newPerson) {
//        Person person = new Person();
        //person.name = newPerson.name;
        newPerson.birthDate = LocalDate.of(1981, Month.APRIL, 10);
        //save into db
        Person.persist(newPerson);
        return "Created";
    }

    public Person findByName(String name) {
        return Person.findByName(name);
    }
}
