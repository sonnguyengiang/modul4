package code.services;

import code.model.Customer;

import java.util.ArrayList;

public class CustomerServices implements ICustomerServices{
    public ArrayList<Customer> list = new ArrayList<>();

    @Override
    public void save(Customer employee) {
        list.add(employee);
    }

    @Override
    public ArrayList<Customer> findAll() {
        return list;
    }

    @Override
    public void Delete(int index) {
        list.remove(index);
    }

    @Override
    public void edit(int index, Customer customer) {
        list.set(index, customer);
    }

    @Override
    public Customer findByIndex(int index) {
        return list.get(index);
    }
}
