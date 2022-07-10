package hospital.medical.record.manament.domains;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

import hospital.medical.record.manament.constants.Gender;
import hospital.medical.record.manament.util.StringListConverter;

@Entity
public class Patient extends Person {

	@Id
	private String medicalNumber;

	@NotBlank(message = "possword cannot be blank")
	private String password;

	// @OneToMany(mappedBy = "patient")
	// private List<MedicalVisit> medicalVisit;

	@Convert(converter = StringListConverter.class)
	@Column(columnDefinition = "TEXT")
	private List<String> allergies;

	@Convert(converter = StringListConverter.class)
	@Column(columnDefinition = "TEXT")
	private List<String> chronicDiseases;

	@Convert(converter = StringListConverter.class)
	@Column(columnDefinition = "TEXT")
	private List<String> diseasesFamily;

	@ManyToOne
	@JoinColumn(name = "myDoctor")
	private Doctor myDoctor;

	// @OneToMany(mappedBy = "patient")
	// private List<Insurance> insurances;

	public Patient(@NotBlank(message = "Firstname is required") String firstName,
			@NotBlank(message = "Lastname is required") String lastName,
			@NotBlank(message = "ID card number is required") String iDCardNumber, String photoURL, String phoneNumber,
			String email, @NotBlank(message = "Nationality is required") String nationality,
			@NotBlank(message = "Gender is required") Gender gender, Address address, String medicalNumber,
			@NotBlank(message = "possword cannot be blank") String password, Doctor myDoctor) {
		super(firstName, lastName, iDCardNumber, photoURL, phoneNumber, email, nationality, gender, address);
		this.medicalNumber = medicalNumber;
		this.password = password;
		this.allergies = new ArrayList<>();
		this.chronicDiseases = new ArrayList<>();
		this.diseasesFamily = new ArrayList<>();
		this.myDoctor = myDoctor;
	}

	public Patient() {
		super();
	}

	public String getMedicalNumber() {
		return medicalNumber;
	}

	public void setMedicalNumber(String medicalNumber) {
		this.medicalNumber = medicalNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<String> getAllergies() {
		return allergies;
	}

	public void setAllergies(List<String> allergies) {
		this.allergies = allergies;
	}

	public List<String> getChronicDiseases() {
		return chronicDiseases;
	}

	public void setChronicDiseases(List<String> chronicDiseases) {
		this.chronicDiseases = chronicDiseases;
	}

	public List<String> getDiseasesFamily() {
		return diseasesFamily;
	}

	public void setDiseasesFamily(List<String> diseasesFamily) {
		this.diseasesFamily = diseasesFamily;
	}

	public Doctor getMyDoctor() {
		return myDoctor;
	}

	public void setMyDoctor(Doctor myDoctor) {
		this.myDoctor = myDoctor;
	}

}
