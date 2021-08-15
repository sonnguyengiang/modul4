package services;

import dao.CRUD_customer;
import model.Customer;

import java.sql.SQLException;
import java.util.ArrayList;


public class CustomerServices implements ICustomerServices{
    public ArrayList<Customer> list = new ArrayList<>();

    public CustomerServices(){
        try {
            list = CRUD_customer.show();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }


    @Override
    public void create(Customer customer) {
        try {
            CRUD_customer.Create(customer);
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        list.add(customer);
    }

    @Override
    public void edit( Customer customer, int index) {
        try {
            CRUD_customer.edit(customer, list.get(index).getId());
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        list.set(index, customer);
    }

    @Override
    public void delete(int index) {
        try {
            CRUD_customer.delete(list.get(index).getId());
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        list.remove(index);
    }
}
