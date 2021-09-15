package code.repository;

import code.model.Country;
import org.springframework.data.repository.CrudRepository;

public interface ICountryRepo extends CrudRepository<Country, Long> {
}
