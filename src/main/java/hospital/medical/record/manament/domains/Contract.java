package hospital.medical.record.manament.domains;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Contract {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotBlank(message = "Contract Number is Required")
	@Column(nullable = false)
	private String contractNumber;

	@ManyToOne
	@NotNull(message = "The hostpital is Required")
	private Hospital hospital;

	@Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private LocalDate startDate;

	@Column(columnDefinition = "TIMESTAMP", nullable = true)
	private LocalDate endDate;

	@NotNull(message = "contact file is required")
	@Column(nullable = false)
	private String contractLocation;

	public Contract() {
	}

	public Contract(long id, @NotBlank(message = "Contract Number is Required") String contractNumber,
			@NotNull(message = "The hostpital is Required") Hospital hospital, LocalDate startDate, LocalDate endDate,
			@NotNull(message = "contact file is required") String contractLocation) {
		this.id = id;
		this.contractNumber = contractNumber;
		this.hospital = hospital;
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

	public Hospital getHospital() {
		return hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
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
