package pl.kownacki.funds.backend.model.jpa;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "FUND_TYPE")
public class FundType extends AbstractEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "FUND_TYPE_ID", unique = true, nullable = false)
    private Long id;

    @Column(name = "SECTOR")
    private String sector;
}
