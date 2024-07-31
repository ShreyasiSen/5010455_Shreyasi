package com.example.di;

public class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public Customer findCustomerById(String id) {
    
        return new Customer(id, "Shreyasi Sen");
    }
}
