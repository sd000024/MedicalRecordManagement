package hospital.medical.record.manament.domains;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import hospital.medical.record.manament.constants.AdminRole;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Admistration {

	@Id
	private String employmentNumber;
	
	@Enumerated(EnumType.STRING)
	@NotNull(message = "The role must selected")
	@Column(nullable = false)
	private AdminRole adminRole;
	
	@OneToOne
	private Address address;
	
	@OneToOne
	private Contract contract;
	
	@ManyToOne
	private Hospital hospital;
}
