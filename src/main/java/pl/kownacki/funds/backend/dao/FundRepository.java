package pl.kownacki.funds.backend.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.kownacki.funds.backend.model.jpa.Fund;

@Repository
public interface FundRepository extends CrudRepository<Fund, Long> {
}
