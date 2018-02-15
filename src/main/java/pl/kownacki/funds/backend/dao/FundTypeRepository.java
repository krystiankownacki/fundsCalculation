package pl.kownacki.funds.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.kownacki.funds.backend.model.jpa.FundType;

@Repository
public interface FundTypeRepository extends JpaRepository<FundType, Long> {
}
