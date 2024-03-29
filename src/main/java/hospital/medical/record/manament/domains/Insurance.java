package hospital.medical.record.manament.domains;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import hospital.medical.record.manament.constants.InsuranceType;

@Entity
public class Insurance {

	@Id
	private long id;

	@NotNull(message = "insuranceNumber is required")
	@Column(nullable = false)
	private String insuranceNumber;

	@Enumerated(EnumType.STRING)
	@NotNull(message = "Insurance type Date is required")
	@Column(nullable = false)
	private InsuranceType type;

	@NotNull(message = "Expiration Date is required")
	@Column(nullable = false)
	private LocalDate expirationDate;

	/**
	 * the insurance itself will be saved in a server and <fileLocation> will point
	 * the location of insurance.
	 */
	@Column
	private String fileLocation;

	@ManyToOne
	@JoinColumn(name = "patient")
	private Patient patient;

	@Column
	private boolean isValid;

	public Insurance(long id, @NotNull(message = "insuranceNumber is required") String insuranceNumber,
			@NotNull(message = "Insurance type Date is required") InsuranceType type,
			@NotNull(message = "Expiration Date is required") LocalDate expirationDate, String fileLocation,
			Patient patient, boolean isValid) {
		this.id = id;
		this.insuranceNumber = insuranceNumber;
		this.type = type;
		this.expirationDate = expirationDate;
		this.fileLocation = fileLocation;
		this.patient = patient;
		this.isValid = isValid;
	}

	public Insurance() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getInsuranceNumber() {
		return insuranceNumber;
	}

	public void setInsuranceNumber(String insuranceNumber) {
		this.insuranceNumber = insuranceNumber;
	}

	public InsuranceType getType() {
		return type;
	}

	public void setType(InsuranceType type) {
		this.type = type;
	}

	public LocalDate getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(LocalDate expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getFileLocation() {
		return fileLocation;
	}

	public void setFileLocation(String fileLocation) {
		this.fileLocation = fileLocation;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public boolean isValid() {
		return isValid;
	}

	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}

}
