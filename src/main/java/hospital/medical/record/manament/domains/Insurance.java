package hospital.medical.record.manament.domains;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import hospital.medical.record.manament.constants.InsuranceType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Insurance {
	
	@Id
	private long id;
	
	@NotNull(message = "insuranceNumber is required")
	@Column(nullable = false)
	private String insuranceNumber;
	
	@Enumerated(EnumType.STRING)
	@NotNull(message = "Insurance type Date is required")
	@Column(nullable = false)
	private InsuranceType type;
	
	@NotNull(message = "Expiration Date is required")
	@Column(nullable = false)
	private LocalDate expirationDate;
	
	/**
	 * the insurance itself will be saved in a server
	 * and <fileLocation> will point the location of insurance.
	 */
	@Column
	private String fileLocation;
	
	@ManyToOne
	private Patient patient;
	
	@Column
	private boolean isValid;

}
