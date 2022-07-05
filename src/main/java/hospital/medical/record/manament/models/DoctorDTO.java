package hospital.medical.record.manament.models;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import hospital.medical.record.manament.constants.DoctorStatus;
import hospital.medical.record.manament.constants.Gender;
import hospital.medical.record.manament.constants.LevelOfDOctor;
import hospital.medical.record.manament.constants.TypeOfDoctor;

public class DoctorDTO {

	@NotBlank(message = "Doctor ID cannot be blank")
	private String doctorID;

	private String email;

	@NotBlank(message = "Password must at least 7 characters")
	private String password;

	@NotBlank(message = "Firstname is required")
	private String firstName;

	@NotBlank(message = "Lastname is required")
	private String lastName;

	@NotBlank(message = "ID card number is required")
	private String idcardNumber;

	@NotBlank(message = "the phone is required")
	private String phoneNumber;

	private String photoURL;

	@NotBlank(message = "Nationality is required")
	private String nationality;

	private long addressID;

	@NotNull(message = "Hospital is required")
	private long hospitalID;

	private long contractID;

	@NotNull(message = "The level Of Doctor must selected")
	private LevelOfDOctor levelOfDoctor;

	@NotNull(message = "The level Of Doctor must selected")
	private TypeOfDoctor typeOfDoctor;

	@NotNull(message = "The status Of a Doctor must selected")
	private DoctorStatus doctorStatus;

	@NotNull(message = "Speciality is required")
	private String speciality;

	@NotBlank(message = "Gender is required")
	private Gender gender;

	public DoctorDTO() {
	}

	public DoctorDTO(@NotBlank(message = "Doctor ID cannot be blank") String doctorID, String email,
			@NotBlank(message = "Password must at least 7 characters") String password,
			@NotBlank(message = "Firstname is required") String firstName,
			@NotBlank(message = "Lastname is required") String lastName,
			@NotBlank(message = "ID card number is required") String idcardNumber,
			@NotBlank(message = "the phone is required") String phoneNumber, String photoURL,
			@NotBlank(message = "Nationality is required") String nationality, long addressID,
			@NotNull(message = "Hospital is required") long hospitalID, long contractID,
			@NotNull(message = "The level Of Doctor must selected") LevelOfDOctor levelOfDoctor,
			@NotNull(message = "The level Of Doctor must selected") TypeOfDoctor typeOfDoctor,
			@NotNull(message = "The status Of a Doctor must selected") DoctorStatus doctorStatus,
			@NotNull(message = "Speciality is required") String speciality,
			@NotBlank(message = "Gender is required") Gender gender) {
		this.doctorID = doctorID;
		this.email = email;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.idcardNumber = idcardNumber;
		this.phoneNumber = phoneNumber;
		this.photoURL = photoURL;
		this.nationality = nationality;
		this.addressID = addressID;
		this.hospitalID = hospitalID;
		this.contractID = contractID;
		this.levelOfDoctor = levelOfDoctor;
		this.typeOfDoctor = typeOfDoctor;
		this.doctorStatus = doctorStatus;
		this.speciality = speciality;
		this.gender = gender;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public LevelOfDOctor getLevelOfDoctor() {
		return levelOfDoctor;
	}

	public void setLevelOfDoctor(LevelOfDOctor levelOfDoctor) {
		this.levelOfDoctor = levelOfDoctor;
	}

	public String getDoctorID() {
		return doctorID;
	}

	public void setDoctorID(String doctorID) {
		this.doctorID = doctorID;
	}

	public String getIdcardNumber() {
		return idcardNumber;
	}

	public void setIdcardNumber(String idcardNumber) {
		this.idcardNumber = idcardNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPhotoURL() {
		return photoURL;
	}

	public void setPhotoURL(String photoURL) {
		this.photoURL = photoURL;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public long getAddressID() {
		return addressID;
	}

	public void setAddressID(long addressID) {
		this.addressID = addressID;
	}

	public long getHospitalID() {
		return hospitalID;
	}

	public void setHospitalID(long hospitalID) {
		this.hospitalID = hospitalID;
	}

	public long getContractID() {
		return contractID;
	}

	public void setContractID(long contractID) {
		this.contractID = contractID;
	}

	public TypeOfDoctor getTypeOfDoctor() {
		return typeOfDoctor;
	}

	public void setTypeOfDoctor(TypeOfDoctor typeOfDoctor) {
		this.typeOfDoctor = typeOfDoctor;
	}

	public DoctorStatus getDoctorStatus() {
		return doctorStatus;
	}

	public void setDoctorStatus(DoctorStatus doctorStatus) {
		this.doctorStatus = doctorStatus;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

}
