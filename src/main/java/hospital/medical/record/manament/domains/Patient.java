package hospital.medical.record.manament.domains;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;

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
public class Patient extends Person{

	@Id
	private String medicalNumber;
	
	@NotBlank(message = "possword cannot be blank")
	private String password;
	
	@OneToMany(mappedBy = "patient")
	private List<Insurance> insurances;
	
	@OneToMany(mappedBy = "patient")
	private List<MedicalVisit> medicalVisit;
	
	@Convert(converter = StringListConverter.class)
	@Column(columnDefinition="TEXT")
	private List<String> allergies;
	
	@Convert(converter = StringListConverter.class)
	@Column(columnDefinition="TEXT")
	private List<String> chronicDiseases;
	
	@Convert(converter = StringListConverter.class)
	@Column(columnDefinition="TEXT")
	private List<String> diseasesFamily;
	
	@ManyToOne
	private Doctor myDoctor;
}
