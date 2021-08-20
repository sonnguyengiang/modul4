package services;

import model.Customer;

import java.util.ArrayList;

public interface ICustomerServices {
    Customer save(Customer customer);

    ArrayList<Customer> findAll();

    void Delete(Customer customer);

    void edit(Customer customer);
}
