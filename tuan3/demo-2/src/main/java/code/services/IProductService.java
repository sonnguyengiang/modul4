package code.services;

import code.model.Product;

import java.util.ArrayList;
import java.util.List;

public interface IProductService {
    ArrayList<Product> findAll();

    void save(Product product);

    Product findById(int id);

    void update(int id, Product product);

    void remove(int id);

}