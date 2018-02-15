package pl.kownacki.funds.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.kownacki.funds.backend.model.jpa.Strategy;

@Repository
public interface StrategyRepository extends JpaRepository<Strategy, Long> {

}
