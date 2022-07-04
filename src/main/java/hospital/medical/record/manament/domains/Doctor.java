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

import hospital.medical.record.manament.constants.DoctorStatus;
import hospital.medical.record.manament.constants.LevelOfDOctor;
import hospital.medical.record.manament.constants.TypeOfDoctor;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
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
	
	@Enumerated(EnumType.STRING)
	@NotNull(message = "The status Of a Doctor must selected")
	@Column(nullable = false)
	private DoctorStatus DoctorStatus;
	
	@OneToOne
	private Contract contract;

	public String getDoctorNumber() {
		return doctorNumber;
	}

	public void setDoctorNumber(String doctorNumber) {
		this.doctorNumber = doctorNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LevelOfDOctor getLevelOfDoctor() {
		return levelOfDoctor;
	}

	public void setLevelOfDoctor(LevelOfDOctor levelOfDoctor) {
		this.levelOfDoctor = levelOfDoctor;
	}

	public Hospital getHospital() {
		return hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}

	public TypeOfDoctor getTypeOfDoctor() {
		return typeOfDoctor;
	}

	public void setTypeOfDoctor(TypeOfDoctor typeOfDoctor) {
		this.typeOfDoctor = typeOfDoctor;
	}

	public String getSpeciality() {
		return Speciality;
	}

	public void setSpeciality(String speciality) {
		Speciality = speciality;
	}

	public List<Patient> getMyPatients() {
		return myPatients;
	}

	public void setMyPatients(List<Patient> myPatients) {
		this.myPatients = myPatients;
	}

	public DoctorStatus getDoctorStatus() {
		return DoctorStatus;
	}

	public void setDoctorStatus(DoctorStatus doctorStatus) {
		DoctorStatus = doctorStatus;
	}

	public Contract getContract() {
		return contract;
	}

	public void setContract(Contract contract) {
		this.contract = contract;
	}
}
