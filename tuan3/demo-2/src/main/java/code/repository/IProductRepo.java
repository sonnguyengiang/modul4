package code.repository;

import code.model.Product;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IProductRepo extends PagingAndSortingRepository<Product, Long> {
}
