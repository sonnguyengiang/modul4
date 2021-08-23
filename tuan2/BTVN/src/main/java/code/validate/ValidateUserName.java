package code.validate;

import code.model.Employee;
import code.services.IEmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.ArrayList;

public class ValidateUserName implements Validator {
    @Autowired
    IEmployeeServices iEmployeeServices;


    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        ArrayList<Employee> list = iEmployeeServices.findAll();
        Employee employee = (Employee) target;

        for (Employee a:list) {
            if (a.getEmployeeCode().equals(employee.getEmployeeCode())){
                errors.rejectValue("employeeCode", "employeeCode.duplicate");
                break;
            }
        }
    }
}