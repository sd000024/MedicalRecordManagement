package hospital.medical.record.manament.domains;

import java.util.ArrayList;
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
import hospital.medical.record.manament.constants.Gender;
import hospital.medical.record.manament.constants.LevelOfDOctor;
import hospital.medical.record.manament.constants.TypeOfDoctor;

@Entity
public class Doctor extends Person {

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
	private String speciality;

	@OneToMany(mappedBy = "myDoctor")
	private List<Patient> myPatients;

	@Enumerated(EnumType.STRING)
	@NotNull(message = "The status Of a Doctor must selected")
	@Column(nullable = false)
	private DoctorStatus doctorStatus;

	@OneToOne
	private Contract contract;

	public Doctor(@NotBlank(message = "Firstname is required") String firstName,
			@NotBlank(message = "Lastname is required") String lastName,
			@NotBlank(message = "ID card number is required") String iDCardNumber, String photoURL, String phoneNumber,
			String email, @NotBlank(message = "Nationality is required") String nationality,
			@NotBlank(message = "Gender is required") Gender gender, Address address, String doctorNumber,
			@NotBlank(message = "Password must at least 7 characters") String password,
			@NotNull(message = "The level Of Doctor must selected") LevelOfDOctor levelOfDoctor,
			@NotNull(message = "Hospital is required") Hospital hospital,
			@NotNull(message = "The level Of Doctor must selected") TypeOfDoctor typeOfDoctor,
			@NotNull(message = "Speciality is required") String speciality,
			@NotNull(message = "The status Of a Doctor must selected") DoctorStatus doctorStatus, Contract contract) {
		super(firstName, lastName, iDCardNumber, photoURL, phoneNumber, email, nationality, gender, address);
		this.doctorNumber = doctorNumber;
		this.password = password;
		this.levelOfDoctor = levelOfDoctor;
		this.hospital = hospital;
		this.typeOfDoctor = typeOfDoctor;
		this.speciality = speciality;
		this.myPatients =  new ArrayList<Patient>();
		this.doctorStatus = doctorStatus;
		this.contract = contract;
	}

	public Doctor() {
		super();
	}

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
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public List<Patient> getMyPatients() {
		return myPatients;
	}

	public void setMyPatients(List<Patient> myPatients) {
		this.myPatients = myPatients;
	}

	public DoctorStatus getDoctorStatus() {
		return this.doctorStatus;
	}

	public void setDoctorStatus(DoctorStatus doctorStatus) {
		this.doctorStatus = doctorStatus;
	}

	public Contract getContract() {
		return contract;
	}

	public void setContract(Contract contract) {
		this.contract = contract;
	}
}
