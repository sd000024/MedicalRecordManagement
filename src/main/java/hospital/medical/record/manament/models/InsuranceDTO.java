package hospital.medical.record.manament.models;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;

import hospital.medical.record.manament.constants.InsuranceType;

public class InsuranceDTO {

	
	private long id;

	@NotNull(message = "insuranceNumber is required")
	private String insuranceNumber;

	@NotNull(message = "Insurance type Date is required")
	private InsuranceType type;

	@NotNull(message = "Expiration Date is required")
	private LocalDate expirationDate;

	/**
	 * the insurance itself will be saved in a server and <fileLocation> will point
	 * the location of insurance.
	 */
	private String fileLocation;

	private String patientID
	;

	@Column
	private boolean isValid;

	public InsuranceDTO(long id, @NotNull(message = "insuranceNumber is required") String insuranceNumber,
			@NotNull(message = "Insurance type Date is required") InsuranceType type,
			@NotNull(message = "Expiration Date is required") LocalDate expirationDate, String fileLocation,
			String patientID, boolean isValid) {
		this.id = id;
		this.insuranceNumber = insuranceNumber;
		this.type = type;
		this.expirationDate = expirationDate;
		this.fileLocation = fileLocation;
		this.patientID = patientID;
		this.isValid = isValid;
	}

	public InsuranceDTO() {
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

	public String getPatient() {
		return patientID;
	}

	public void setPatient(String patientID) {
		this.patientID = patientID;
	}

	public boolean isValid() {
		return isValid;
	}

	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}

}
