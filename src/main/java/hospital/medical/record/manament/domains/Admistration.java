package hospital.medical.record.manament.domains;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import hospital.medical.record.manament.constants.AdminRole;
import hospital.medical.record.manament.constants.Gender;

@Entity
public class Admistration extends Person {

	@Id
	private String employmentNumber;

	@Enumerated(EnumType.STRING)
	@NotNull(message = "The role must selected")
	@Column(nullable = false)
	private AdminRole adminRole;

	@OneToOne
	private Contract contract;

	@ManyToOne
	private Hospital hospital;

	public Admistration(@NotBlank(message = "Firstname is required") String firstName,
			@NotBlank(message = "Lastname is required") String lastName,
			@NotBlank(message = "ID card number is required") String iDCardNumber, String photoURL, String phoneNumber,
			String email, @NotBlank(message = "Nationality is required") String nationality,
			@NotBlank(message = "Gender is required") Gender gender, Address address, String employmentNumber,
			@NotNull(message = "The role must selected") AdminRole adminRole, Contract contract, Hospital hospital) {
		super(firstName, lastName, iDCardNumber, photoURL, phoneNumber, email, nationality, gender, address);
		this.employmentNumber = employmentNumber;
		this.adminRole = adminRole;
		this.contract = contract;
		this.hospital = hospital;
	}

	public Admistration() {
		super();
	}

	public String getEmploymentNumber() {
		return employmentNumber;
	}

	public void setEmploymentNumber(String employmentNumber) {
		this.employmentNumber = employmentNumber;
	}

	public AdminRole getAdminRole() {
		return adminRole;
	}

	public void setAdminRole(AdminRole adminRole) {
		this.adminRole = adminRole;
	}

	public Contract getContract() {
		return contract;
	}

	public void setContract(Contract contract) {
		this.contract = contract;
	}

	public Hospital getHospital() {
		return hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}

}
