package code.controller;

import code.model.Customer;
import code.services.ICustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    @Autowired
    ICustomerServices iCustomerServices;

    @GetMapping
    public Page<Customer> show(@RequestParam(defaultValue = "0") int page){
        return iCustomerServices.findAll(PageRequest.of(page, 5));
    }

    @PostMapping
    public ResponseEntity<Customer> create(@RequestBody Customer customer){
        return new ResponseEntity<>(iCustomerServices.save(customer), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Customer> update(@RequestBody Customer customer){
        return new ResponseEntity<>(iCustomerServices.update(customer), HttpStatus.OK);
    }
}
