package code.repository;

import code.model.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ICustomerRepo extends PagingAndSortingRepository<Customer, Long> {
}
