package code.services;

import code.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICustomerServices {
    Page<Customer> findAll(Pageable pageable);

    Customer save(Customer customer);

    Customer update(Customer customer);

    void delete(Customer customer);

    Customer findById(long id);
}
