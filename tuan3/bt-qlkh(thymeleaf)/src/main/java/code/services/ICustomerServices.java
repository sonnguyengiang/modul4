package code.services;


import code.model.Customer;

import java.util.ArrayList;

public interface ICustomerServices {
    void save(Customer employee);

    ArrayList<Customer> findAll();

    void Delete(int index);

    void edit(int index, Customer customer);

    Customer findByIndex(int index);

}
