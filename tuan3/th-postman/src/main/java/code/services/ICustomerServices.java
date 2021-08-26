package code.services;

import code.model.Customer;
import java.util.Optional;
public interface ICustomerServices{
    Iterable<Customer> findAll();

    Optional<Customer> findById(Long id);

    Customer save(Customer customer);

    void remove(Long id);
}
