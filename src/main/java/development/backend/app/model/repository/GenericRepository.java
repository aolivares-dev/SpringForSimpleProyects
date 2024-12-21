package development.backend.app.model.repository;

import development.backend.app.model.entity.GenericEntityDTO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenericRepository extends CrudRepository<GenericEntityDTO, Long> { }
