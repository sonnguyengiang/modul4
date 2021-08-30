package code.services;

import code.model.Customer;
import code.repository.ICustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class CustomerServices implements ICustomerServices {
    @Autowired
    ICustomerRepo iCustomerRepo;

    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return iCustomerRepo.findAll(pageable);
    }

    @Override
    public Customer save(Customer customer) {
        return iCustomerRepo.save(customer);
    }

    @Override
    public Customer update(Customer customer) {
        return iCustomerRepo.save(customer);
    }

    @Override
    public void delete(Customer customer) {

    }

    @Override
    public Customer findById(long id) {
        return iCustomerRepo.findById(id).get();
    }
}
