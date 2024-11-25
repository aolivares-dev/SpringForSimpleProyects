package development.backend.app.model.repository;

import development.backend.app.model.entity.Account;
import org.springframework.data.repository.CrudRepository;

public interface Repository<T> extends CrudRepository<T, Long> { }
