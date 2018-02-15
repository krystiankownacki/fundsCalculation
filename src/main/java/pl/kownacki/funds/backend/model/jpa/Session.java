package pl.kownacki.funds.backend.model.jpa;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "SESSION")
public class Session extends AbstractEntity{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "SESSION_ID", unique = true, nullable = false)
	private Long id;

	@OneToMany
	private List<Transcation> transactions;

	@Column(name = "TOTAL_AMOUNT")
	private Integer totalAmount;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "STRATEGY", referencedColumnName = "NAME")
	private Strategy strategy;
}
