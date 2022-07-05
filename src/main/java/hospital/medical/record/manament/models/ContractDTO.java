package hospital.medical.record.manament.models;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


public class ContractDTO {


	private long id;

	@NotBlank(message = "Contract Number is Required")
	private String contractNumber;

	@NotNull(message = "The hostpital is Required")
	private long hospitalID;

	private LocalDate startDate;

	private LocalDate endDate;

	@NotNull(message = "contact file is required")
	private String contractLocation;

	public ContractDTO() {
	}

	public ContractDTO(long id, @NotBlank(message = "Contract Number is Required") String contractNumber,
			@NotNull(message = "The hostpital is Required") long hospitalID, LocalDate startDate, LocalDate endDate,
			@NotNull(message = "contact file is required") String contractLocation) {
		this.id = id;
		this.contractNumber = contractNumber;
		this.hospitalID = hospitalID;
		this.startDate = startDate;
		this.endDate = endDate;
		this.contractLocation = contractLocation;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getContractNumber() {
		return contractNumber;
	}

	public void setContractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
	}

	public long getHospital() {
		return hospitalID;
	}

	public void setHospital(long hospitalID) {
		this.hospitalID = hospitalID;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public String getContractLocation() {
		return contractLocation;
	}

	public void setContractLocation(String contractLocation) {
		this.contractLocation = contractLocation;
	}

}
