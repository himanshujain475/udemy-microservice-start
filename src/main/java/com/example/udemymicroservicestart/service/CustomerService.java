package com.example.udemymicroservicestart.service;

import com.example.udemymicroservicestart.dto.CustomerDto;

import java.util.UUID;

public interface CustomerService  {

    CustomerDto getCustomerById(UUID customerId);

    CustomerDto saveNewCustomer(CustomerDto customerDto);

    void updateCustomer(UUID customerId, CustomerDto customerDto);

    void deleteById(UUID customerId);
}
