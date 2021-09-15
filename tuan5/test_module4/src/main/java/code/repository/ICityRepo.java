package code.repository;

import code.model.City;
import org.springframework.data.repository.CrudRepository;

public interface ICityRepo extends CrudRepository<City, Long> {
}
