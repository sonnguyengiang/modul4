package services;

import model.Blog;

import java.util.ArrayList;

public interface IBlogServices {
    Blog save(Blog customer);

    ArrayList<Blog> findAll();

    void Delete(Blog customer);

    void edit(Blog customer);

    ArrayList<Blog> findName(String name);
}
