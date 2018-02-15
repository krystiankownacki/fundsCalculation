package pl.kownacki.funds.backend.model.jpa;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "STRATEGY")
public class Strategy extends AbstractEntity{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "STRATEGY_ID", unique = true, nullable = false)
	private Long id;

	@Column(name = "NAME")
	private String name;

	@Column(name = "INTERNAL")
	private Integer internal;

	@Column(name = "EXTERNAL")
	private Integer external;

	@Column(name = "MONEY")
	private Integer money;
}
