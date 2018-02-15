package pl.kownacki.funds.backend.model.jpa;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "TRANSCATION")
public class Transcation extends AbstractEntity{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "TRANSACTION_ID", unique = true, nullable = false)
	private Long id;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FUND", referencedColumnName = "NAME")
	private Fund fund;

	@Column(name = "NAME")
	private Integer amount;
}
