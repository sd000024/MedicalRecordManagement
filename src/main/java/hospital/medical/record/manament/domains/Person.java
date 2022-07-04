package hospital.medical.record.manament.domains;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;

import hospital.medical.record.manament.constants.Gender;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class Person {
	
	@NotBlank(message = "Firstname is required")
	@Column(nullable = false)
	private String firstName;
	
	@NotBlank(message = "Lastname is required")
	@Column(nullable = false)
	private String lastName;
	
	@NotBlank(message = "ID card number is required")
	@Column(nullable = false)
	private String IDCardNumber;
	
	@Column
	private String photoURL;
	
	@Column
	private String phoneNumber;
	
	@Column
	private String email;
	
	@NotBlank(message = "Nationality is required")
	@Column(nullable = false)
	private String nationality;
	
	@NotBlank(message = "Gender is required")
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	@OneToOne
	private Address address;

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
		IDCardNumber = iDCardNumber;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
