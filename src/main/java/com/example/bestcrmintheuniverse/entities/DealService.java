package com.example.bestcrmintheuniverse.entities;



import com.example.bestcrmintheuniverse.repositories.DealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DealService {
    private final DealRepository dealRepository;

    @Autowired
    public DealService(DealRepository dealRepository) {
        this.dealRepository = dealRepository;
    }

    public Deal getDealById(Long id) {
        return dealRepository.findById(id).orElse(null);
    }
    // Add methods for CRUD operations and any other business logic

    // ...
}