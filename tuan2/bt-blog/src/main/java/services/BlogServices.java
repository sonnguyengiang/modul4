package services;

import model.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import repository.IBlogRepo;

import java.util.ArrayList;

public class BlogServices implements IBlogServices {
    @Autowired
    IBlogRepo iCustomerRepo;

    @Override
    public Blog save(Blog customer) {
        return iCustomerRepo.save(customer);
    }

    @Override
    public ArrayList<Blog> findAll() {
        return iCustomerRepo.findAll();
    }

    @Override
    public void Delete(Blog customer) {
        iCustomerRepo.Delete(customer);
    }

    @Override
    public void edit(Blog customer) {
        iCustomerRepo.edit(customer);
    }

    @Override
    public ArrayList<Blog> findName(String name) {
        return iCustomerRepo.findName(name);
    }
}
