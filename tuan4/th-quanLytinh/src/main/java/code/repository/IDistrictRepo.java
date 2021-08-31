package code.repository;

import code.model.District;
import org.springframework.data.repository.CrudRepository;

public interface IDistrictRepo extends CrudRepository<District, Long> {
}
