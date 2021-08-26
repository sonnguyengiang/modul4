package code.services;

import code.model.Customer;
import code.repository.ICustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServices implements ICustomerServices{
    @Autowired
    ICustomerRepo iCustomerRepo;

    @Override
    public Iterable<Customer> findAll() {
        return iCustomerRepo.findAll();
    }

    @Override
    public Optional<Customer> findById(Long id) {
        return iCustomerRepo.findById(id);
    }

    @Override
    public Customer save(Customer customer) {
        return iCustomerRepo.save(customer);
    }

    @Override
    public void remove(Long id) {
        iCustomerRepo.deleteById(id);
    }
}
