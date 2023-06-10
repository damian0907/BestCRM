package com.example.bestcrmintheuniverse.repositories;

import com.example.bestcrmintheuniverse.entities.Client;
import com.example.bestcrmintheuniverse.entities.Deal;
import org.springframework.data.repository.CrudRepository;
import java.util.List;


public interface ClientRepository extends CrudRepository<Client,Long> {


}
