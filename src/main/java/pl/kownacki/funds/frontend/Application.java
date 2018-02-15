package pl.kownacki.funds.frontend;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import pl.kownacki.funds.backend.dao.FundRepository;
import pl.kownacki.funds.backend.dao.FundTypeRepository;
import pl.kownacki.funds.backend.dao.StrategyRepository;
import pl.kownacki.funds.backend.model.jpa.Fund;
import pl.kownacki.funds.backend.model.jpa.FundType;
import pl.kownacki.funds.backend.model.jpa.Strategy;

@EnableJpaRepositories({
        "pl.kownacki.funds.backend.dao"
})
@EntityScan({
        "pl.kownacki.funds.backend.model.jpa"
})
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner init(final FundRepository fundRepository, final FundTypeRepository fundTypeRepository, final StrategyRepository strategyRepository) {
        return new CommandLineRunner() {

            @Override
            public void run(String... arg0) throws Exception {

                FundType fundType1 = new FundType();
                fundType1.setSector("Polskie");
                fundTypeRepository.save(fundType1);

                Fund fund1 = new Fund();
                fund1.setName("Fundusz Polski 1");
                fund1.setType(fundType1);
                fundRepository.save(fund1);

                Fund fund2 = new Fund();
                fund2.setName("Fundusz Polski 2");
                fund2.setType(fundType1);
                fundRepository.save(fund2);

                Fund fund3 = new Fund();
                fund3.setName("Fundusz Polski 3");
                fund3.setType(fundType1);
                fundRepository.save(fund3);

                FundType fundType2 = new FundType();
                fundType2.setSector("Zagraniczne");
                fundTypeRepository.save(fundType2);

                Fund fund4 = new Fund();
                fund4.setName("Fundusz Zagraniczny 1");
                fund4.setType(fundType2);
                fundRepository.save(fund4);

                Fund fund5 = new Fund();
                fund5.setName("Fundusz Zagraniczny 2");
                fund5.setType(fundType2);
                fundRepository.save(fund5);

                Fund fund6 = new Fund();
                fund6.setName("Fundusz Zagraniczny 3");
                fund6.setType(fundType2);
                fundRepository.save(fund6);

                FundType fundType3 = new FundType();
                fundType3.setSector("Pieniezne");
                fundTypeRepository.save(fundType3);

                Fund fund7 = new Fund();
                fund7.setName("Fundusz Pieniezny 1");
                fund7.setType(fundType3);
                fundRepository.save(fund7);

                Strategy strategy1 = new Strategy();
                strategy1.setName("Bezpieczna");
                strategy1.setInternal(20);
                strategy1.setExternal(75);
                strategy1.setMoney(5);
                strategyRepository.save(strategy1);

                Strategy strategy2 = new Strategy();
                strategy2.setName("Zrownowazona");
                strategy2.setInternal(30);
                strategy2.setExternal(60);
                strategy2.setMoney(10);
                strategyRepository.save(strategy2);

                Strategy strategy3 = new Strategy();
                strategy3.setName("Agresywna");
                strategy3.setInternal(40);
                strategy3.setExternal(20);
                strategy3.setMoney(40);
                strategyRepository.save(strategy3);

            }
        };
    }
}
