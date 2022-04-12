package com.example.udemymicroservicestart.service;

import com.example.udemymicroservicestart.dto.BeerDto;

import java.util.UUID;

public interface BeerService {

    BeerDto getBearById(UUID beerId);


    BeerDto saveNewBeer(BeerDto beerDto);

    void updateBeer(UUID beerId, BeerDto beerDto);

    void deleteById(UUID beerId);
}
