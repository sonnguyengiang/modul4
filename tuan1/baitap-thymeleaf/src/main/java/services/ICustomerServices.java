package services;

import model.Customer;

public interface ICustomerServices {

    void create(Customer customer);

    void edit(Customer customer, int index);

    void delete(int index);
}
