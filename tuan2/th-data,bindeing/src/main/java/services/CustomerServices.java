package services;

import model.Customer;

import java.util.ArrayList;

public class CustomerServices {
    public ArrayList<Customer> list = new ArrayList<>();

    public void save(Customer customer){
        list.add(customer);
    }
}
