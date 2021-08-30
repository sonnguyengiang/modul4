package code.services;

import code.model.Customer;

import java.util.ArrayList;

public interface ICustomerServices {
    void save(Customer customer);

    ArrayList<Customer> findAll();

    void delete(Customer customer);

    Customer findById(long id);
}
