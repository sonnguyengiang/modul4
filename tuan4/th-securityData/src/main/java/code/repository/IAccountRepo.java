package code.repository;

import code.model.Account;
import org.springframework.data.repository.CrudRepository;

public interface IAccountRepo extends CrudRepository<Account, Long> {
    Account findByUsername(String username);
}
