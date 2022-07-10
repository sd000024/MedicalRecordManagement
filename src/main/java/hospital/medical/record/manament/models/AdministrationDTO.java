package hospital.medical.record.manament.models;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import hospital.medical.record.manament.constants.AdminRole;
import hospital.medical.record.manament.constants.Gender;

public class AdministrationDTO {

	@NotBlank(message = "Employment Number is required")
	private String employmentNumber;

	@NotBlank(message = "Firstname is required")
	private String firstName;

	@NotBlank(message = "Lastname is required")
	private String lastName;

	@NotBlank(message = "ID card number is required")
	private String IDCardNumber;

	private String photoURL;

	private String phoneNumber;

	private String email;

	@NotNull(message = "The role must selected")
	private AdminRole adminRole;

	private long contractID;

	private long hospitalID;

	@NotBlank(message = "Nationality is required")
	private String nationality;

	@NotBlank(message = "Gender is required")
	private Gender gender;

	private long addressID;

	public AdministrationDTO(@NotBlank(message = "Employment Number is required") String employmentNumber,
			@NotBlank(message = "Firstname is required") String firstName,
			@NotBlank(message = "Lastname is required") String lastName,
			@NotBlank(message = "ID card number is required") String iDCardNumber, String photoURL, String phoneNumber,
			String email, @NotNull(message = "The role must selected") AdminRole adminRole, long contractID,
			long hospitalID, @NotBlank(message = "Nationality is required") String nationality,
			@NotBlank(message = "Gender is required") Gender gender, long addressID) {
		this.employmentNumber = employmentNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.IDCardNumber = iDCardNumber;
		this.photoURL = photoURL;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.adminRole = adminRole;
		this.contractID = contractID;
		this.hospitalID = hospitalID;
		this.nationality = nationality;
		this.gender = gender;
		this.addressID = addressID;
	}
	

	public AdministrationDTO() {
	}


	public String getEmploymentNumber() {
		return employmentNumber;
	}

	public void setEmploymentNumber(String employmentNumber) {
		this.employmentNumber = employmentNumber;
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

	public String getIDCardNumber() {
		return IDCardNumber;
	}

	public void setIDCardNumber(String iDCardNumber) {
		this.IDCardNumber = iDCardNumber;
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

	public AdminRole getAdminRole() {
		return adminRole;
	}

	public void setAdminRole(AdminRole adminRole) {
		this.adminRole = adminRole;
	}

	public long getContractID() {
		return contractID;
	}

	public void setContractID(long contractID) {
		this.contractID = contractID;
	}

	public long getHospitalID() {
		return hospitalID;
	}

	public void setHospitalID(long hospitalID) {
		this.hospitalID = hospitalID;
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

}
