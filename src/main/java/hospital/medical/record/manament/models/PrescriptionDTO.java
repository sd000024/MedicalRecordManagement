package hospital.medical.record.manament.models;

import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

public class PrescriptionDTO {

	private long id;

	@NotBlank(message = "Duration is required")
	private int duracion;

	@NotBlank(message = "Number of dose per day is required")
	private int dailyDose;

	@ManyToOne
	private long drugID;

	@ManyToOne
	private long medicalVisitID;

	public PrescriptionDTO() {
	}

	public PrescriptionDTO(long id, @NotBlank(message = "Duration is required") int duracion,
			@NotBlank(message = "Number of dose per day is required") int dailyDose, long drugID, long medicalVisitID) {
		this.id = id;
		this.duracion = duracion;
		this.dailyDose = dailyDose;
		this.drugID = drugID;
		this.medicalVisitID = medicalVisitID;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public int getDailyDose() {
		return dailyDose;
	}

	public void setDailyDose(int dailyDose) {
		this.dailyDose = dailyDose;
	}

	public long getDrugID() {
		return drugID;
	}

	public void setDrugID(long drugID) {
		this.drugID = drugID;
	}

	public long getMedicalVisitID() {
		return medicalVisitID;
	}

	public void setMedicalVisitID(long medicalVisitID) {
		this.medicalVisitID = medicalVisitID;
	}

}
