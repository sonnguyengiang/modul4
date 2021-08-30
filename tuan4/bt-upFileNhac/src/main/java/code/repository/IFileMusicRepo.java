package code.repository;

import code.model.FileMusic;
import org.springframework.data.repository.CrudRepository;

public interface IFileMusicRepo extends CrudRepository<FileMusic, Long> {
}
