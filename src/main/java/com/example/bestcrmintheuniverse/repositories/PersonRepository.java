package com.example.bestcrmintheuniverse.repositories;

import com.example.bestcrmintheuniverse.entities.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface PersonRepository extends CrudRepository<Person, Long> {
 // Add additional query methods if needed
}
