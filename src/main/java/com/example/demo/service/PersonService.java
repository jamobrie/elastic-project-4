package com.example.demo.service;

import com.example.demo.document.Person;
import com.example.demo.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PersonService {

    private final PersonRepository repository;

    public void save(final Person person){
//        repository.save(person);
    }

    public Person findById(final String id){
//        return repository.findById(id).orElse(null);
        return null;
    }

}
