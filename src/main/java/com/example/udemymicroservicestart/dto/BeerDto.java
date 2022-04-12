package com.example.udemymicroservicestart.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Data
@Getter
@Setter
@Builder
public class BeerDto {
    private UUID id;
    private String beerName;
    private String beerStyle;

    private Long upc;
}
