package code.services;

import code.model.Employee;
import code.repository.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.util.ArrayList;

public class EmployeeServices implements IEmployeeServices{

    @Autowired
    IEmployeeRepo iEmployeeRepo;

    @Override
    public Employee save(Employee employee) {
        return iEmployeeRepo.save(employee);
    }

    @Override
    public Employee findById(long id) {
        return iEmployeeRepo.findById(id).get();
    }

    @Override
    public ArrayList<Employee> findAll() {
        return (ArrayList<Employee>) iEmployeeRepo.findAll();
    }

    @Override
    public ArrayList<Employee> findAllByName(String name) {
        return iEmployeeRepo.findAllByName(name);
    }

    @Override
    public void Delete(Employee employee) {
        iEmployeeRepo.delete(employee);
    }

    @Override
    public void edit(Employee employee) {
        iEmployeeRepo.save(employee);
    }

    @Override
    public Page<Employee> findAllPage(Pageable pageable) {
       return iEmployeeRepo.findAll(pageable);
    }

    @Override
    public ArrayList<Employee> xapxep() {
        return iEmployeeRepo.sapxep();
    }


}
