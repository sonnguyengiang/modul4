package code.services;

import code.model.Customer;
import code.repository.ICustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class CustomerServices implements ICustomerServices{

    @Autowired
    ICustomerRepo iCustomerRepo;

    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return iCustomerRepo.findAll(pageable);
    }

    @Override
    public void save(Customer customer) {
        iCustomerRepo.save(customer);
    }

    @Override
    public void remove(Customer customer) {
        iCustomerRepo.delete(customer);
    }

    @Override
    public Customer findById(long index) {
        return iCustomerRepo.findById(index).get();
    }
}
