package code.services;

import code.model.Customer;
import code.repository.ICustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

public class CustomerServices implements ICustomerServices{
    @Autowired
    ICustomerRepo iCustomerRepo;
    @Override
    public void save(Customer customer) {
        iCustomerRepo.save(customer);
    }

    @Override
    public ArrayList<Customer> findAll() {
        return (ArrayList<Customer>) iCustomerRepo.findAll();
    }

    @Override
    public void delete(Customer customer) {
        iCustomerRepo.delete(customer);
    }

    @Override
    public Customer findById(long id) {
        return iCustomerRepo.findById(id).get();
    }
}
