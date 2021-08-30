package code.repository;

import code.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ICustomerRepo extends PagingAndSortingRepository<Customer, Long> {
    Page<Customer> findAll(Pageable pageable);
}
