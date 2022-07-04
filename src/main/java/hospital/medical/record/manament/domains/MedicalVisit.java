package hospital.medical.record.manament.domains;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import hospital.medical.record.manament.util.StringListConverter;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class MedicalVisit {
	
	@Id
	private long id;
	
	@Convert(converter = StringListConverter.class)
	private List<String> diagonsises;
	
	@OneToMany(mappedBy = "medicalVisit")
	private List<Prescription> prescription;
		
	@Convert(converter = StringListConverter.class)
	@Column(columnDefinition="TEXT", nullable = false)
	private List<String> symptoms;
	
	@NotNull(message = "Date cannot be null")
	@Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private LocalDateTime date;
	
	@ManyToOne
	@NotNull(message = "Doctor cannot be null")
	private Doctor  doctor;
	
	@ManyToOne
	@NotNull(message = "Patient cannot be null")
	private Patient  patient;
	
	@Column(columnDefinition="TEXT")
	private String comments;

}
