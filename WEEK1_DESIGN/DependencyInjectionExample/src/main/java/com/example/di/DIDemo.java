package com.example.di;

public class DIDemo {
    public static void main(String[] args) {
        // Create repository
        CustomerRepository repository = new CustomerRepositoryImpl();

        // Inject repository into service
        CustomerService service = new CustomerService(repository);

        // Use service to get a customer
        Customer customer = service.getCustomerById("154");

        // Display customer details
        System.out.println("Customer ID: " + customer.getId());
        System.out.println("Customer Name: " + customer.getName());
    }
}
