package repository;

import model.Blog;
import org.jboss.logging.Param;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.ArrayList;

public class BlogRepo implements IBlogRepo {
    @Autowired
    EntityManager entityManager;

    @Override
    public Blog save(Blog customer) {
        entityManager.getTransaction().begin();
        entityManager.persist(customer);
        entityManager.getTransaction().commit();
        return null;
    }

    @Override
    public ArrayList<Blog> findAll() {
        String hql = "select c from Blog as c";
        TypedQuery<Blog> query = entityManager.createQuery(hql, Blog.class);
        return (ArrayList<Blog>) query.getResultList();
    }


    @Override
    public void Delete(Blog customer) {
        entityManager.getTransaction().begin();
        entityManager.remove(customer);
        entityManager.getTransaction().commit();
    }

    @Override
    public void edit(Blog customer) {
        entityManager.getTransaction().begin();
        entityManager.merge(customer);
        entityManager.getTransaction().commit();
    }

    @Override
    public ArrayList<Blog> findName(String nameFind) {
        return null;
    }


}
