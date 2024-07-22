package com.sping.withoutweb.service;

import com.sping.withoutweb.entity.Person;
import com.sping.withoutweb.repository.PersonRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class serviceImpl implements service {

    @Autowired
   private PersonRepository personRepository;

   public void instertToDb(String name, String lastName){
        Person person = new Person(name,lastName, name + lastName + "@gmail.com");
        personRepository.save(person);

    }
}
