package com.example.demo.controller;

import com.example.demo.document.Person;
import com.example.demo.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/person")
@AllArgsConstructor
public class PersonController {

    private final PersonService service;

    @PostMapping()
    public void save(@RequestBody final Person person) {
        service.save(person);
    }

    @GetMapping("/{id}")
    public Person findById(@PathVariable final String id) {
        return service.findById(id);
    }

}
