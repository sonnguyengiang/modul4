package code.services;

import code.model.Employee;

import java.util.ArrayList;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IEmployeeServices {
    Employee save(Employee employee);

    Employee findById(long id);

    ArrayList<Employee> findAll();

    ArrayList<Employee> findAllByName(String name);

    void Delete(Employee employee);

    void edit(Employee employee);

    Page<Employee> findAllPage(Pageable pageable);

    ArrayList<Employee> xapxep();
}
