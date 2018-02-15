package pl.kownacki.funds.backend.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.kownacki.funds.backend.model.jpa.Fund;

import java.util.List;

@Repository
public interface FundRepository extends CrudRepository<Fund, Long> {

    List<Fund> findAllByIdIn(List<Long> ids);
}
