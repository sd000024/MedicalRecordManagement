package hospital.medical.record.manament.models;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotBlank;

import hospital.medical.record.manament.constants.Gender;

public class PatientDTO {

	private String medicalNumber;

	@NotBlank(message = "possword cannot be blank")
	private String password;

	@NotBlank(message = "Firstname is required")
	private String firstName;

	@NotBlank(message = "Lastname is required")
	private String lastName;

	@NotBlank(message = "ID card number is required")
	private String idCardNumber;

	private String photoURL;

	private String phoneNumber;

	private String email;

	@NotBlank(message = "Nationality is required")
	private String nationality;

	@NotBlank(message = "Gender is required")
	private Gender gender;

	private long addressID;

	private List<String> allergies;

	private List<String> diseasesFamily;

	private String myDoctorID;

	public PatientDTO() {
	}

	public PatientDTO(String medicalNumber, @NotBlank(message = "possword cannot be blank") String password,
			@NotBlank(message = "Firstname is required") String firstName,
			@NotBlank(message = "Lastname is required") String lastName,
			@NotBlank(message = "ID card number is required") String iDCardNumber, String photoURL, String phoneNumber,
			String email, @NotBlank(message = "Nationality is required") String nationality,
			@NotBlank(message = "Gender is required") Gender gender, long addressID, String myDoctorID) {
		super();
		this.medicalNumber = medicalNumber;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.idCardNumber = iDCardNumber;
		this.photoURL = photoURL;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.nationality = nationality;
		this.gender = gender;
		this.addressID = addressID;
		this.allergies = new ArrayList<>();
		this.diseasesFamily = new ArrayList<>();
		this.myDoctorID = myDoctorID;
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

	public String getIdCardNumber() {
		return idCardNumber;
	}

	public void setIdCardNumber(String idCardNumber) {
		this.idCardNumber = idCardNumber;
	}

	public String getPhotoURL() {
		return photoURL;
	}

	public void setPhotoURL(String photoURL) {
		this.photoURL = photoURL;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public long getAddressID() {
		return addressID;
	}

	public void setAddressID(long addressID) {
		this.addressID = addressID;
	}

	public List<String> getAllergies() {
		return allergies;
	}

	public void setAllergies(List<String> allergies) {
		this.allergies = allergies;
	}

	public List<String> getDiseasesFamily() {
		return diseasesFamily;
	}

	public void setDiseasesFamily(List<String> diseasesFamily) {
		this.diseasesFamily = diseasesFamily;
	}

	public String getMyDoctorID() {
		return myDoctorID;
	}

	public void setMyDoctorID(String myDoctorID) {
		this.myDoctorID = myDoctorID;
	}

}
