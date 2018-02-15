package pl.kownacki.funds.backend.model.jpa;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "FUND")
public class Fund extends AbstractEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "FUND_ID", unique = true, nullable = false)
    private Long id;

    @Column(name = "NAME")
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TYPE", referencedColumnName = "SECTOR")
    private FundType type;
}
