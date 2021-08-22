package code.repository;

import code.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.ArrayList;

public interface IEmployeeRepo extends PagingAndSortingRepository<Employee, Long> {
    Page<Employee> findAll(Pageable pageable);

    @Query(value = "SELECT * FROM btvn.Employee where name like concat('%',:name,'%')", nativeQuery = true)
    public ArrayList<Employee> findAllByName(@Param("name") String findName);

    @Query(value = "SELECT * FROM btvn.Employee  order by age desc", nativeQuery = true)
    public ArrayList<Employee> sapxep();
}
