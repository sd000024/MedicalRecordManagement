package hospital.medical.record.manament.domains;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import hospital.medical.record.manament.constants.LevelOfDOctor;
import hospital.medical.record.manament.constants.TypeOfDoctor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Doctor extends Person{
	
	@Id
	private String doctorNumber;
	
	
	@NotBlank(message = "Password must at least 7 characters")
	@Column(nullable = false)
	private String password;
	
	@Enumerated(EnumType.STRING)
	@NotNull(message = "The level Of Doctor must selected")
	@Column(nullable = false)
	private LevelOfDOctor levelOfDoctor;
	
	@ManyToOne
	@NotNull(message = "Hospital is required")
	private Hospital hospital;
	
	@Enumerated(EnumType.STRING)
	@NotNull(message = "The level Of Doctor must selected")
	@Column(nullable = false)
	private TypeOfDoctor typeOfDoctor;
	
	@NotNull(message = "Speciality is required")
	@Column(nullable = false)
	private String Speciality;
	
	@OneToMany(mappedBy = "myDoctor")
	private List<Patient> myPatients;
	
	@OneToOne
	private Contract contract;

}
