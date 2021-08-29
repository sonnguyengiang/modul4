package code.services;

import code.model.Product;
import code.repository.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

public class ProductService implements IProductService{
    @Autowired
    IProductRepo iProductRepo;


    @Override
    public ArrayList<Product> findAll() {
        return (ArrayList<Product>) iProductRepo.findAll();
    }

    @Override
    public void save(Product product) {
        System.out.println("1");
        iProductRepo.save(product);
    }

    @Override
    public Product findById(int id) {
        return null;
    }

    @Override
    public void update(int id, Product product) {

    }

    @Override
    public void remove(int id) {

    }
}
