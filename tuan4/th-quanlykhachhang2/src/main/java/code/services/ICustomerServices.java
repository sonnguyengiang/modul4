package code.services;

import code.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICustomerServices {
    Page<Customer> findAll(Pageable pageable);

    void save(Customer customer);

    void remove(Customer customer);

    Customer findById(long index);
}
