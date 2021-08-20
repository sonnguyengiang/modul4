package repository;

import model.Blog;

import java.util.ArrayList;

public interface IBlogRepo {
    Blog save(Blog customer);

    ArrayList<Blog> findAll();

    void Delete(Blog customer);

    void edit(Blog customer);

    ArrayList<Blog> findName(String nameFind);

}
