package com.example.demo.repository;

import com.example.demo.document.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends ElasticsearchRepository<Person, String> {
    //String as the ID in person is defined as String

//    Page<Person> findByAuthorsName(String name, Pageable pageable);

}
