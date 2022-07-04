package hospital.medical.record.manament.domains;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Prescription {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank(message = "Duration is required")
	@Column(nullable = false)
	private int duracion;
	
	@NotBlank(message = "Number of dose per day is required")
	@Column(nullable = false)
	private int dailyDose;
	
	@ManyToOne
	private Drug drug;
	
	@ManyToOne
	private MedicalVisit medicalVisit;
}
