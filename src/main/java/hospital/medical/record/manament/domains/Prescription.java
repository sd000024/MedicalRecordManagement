package hospital.medical.record.manament.domains;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

@Entity
public class Prescription {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotBlank(message = "Duration is required")
	@Column(nullable = false)
	private int duracion;

	@NotBlank(message = "Number of dose per day is required")
	@Column(nullable = false)
	private int dailyDose;

	@ManyToOne
	private Drug drug;

	@ManyToOne
	private MedicalVisit medicalVisit;

	public Prescription() {
	}

	public Prescription(long id, @NotBlank(message = "Duration is required") int duracion,
			@NotBlank(message = "Number of dose per day is required") int dailyDose, Drug drug,
			MedicalVisit medicalVisit) {
		this.id = id;
		this.duracion = duracion;
		this.dailyDose = dailyDose;
		this.drug = drug;
		this.medicalVisit = medicalVisit;
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

	public Drug getDrug() {
		return drug;
	}

	public void setDrug(Drug drug) {
		this.drug = drug;
	}

	public MedicalVisit getMedicalVisit() {
		return medicalVisit;
	}

	public void setMedicalVisit(MedicalVisit medicalVisit) {
		this.medicalVisit = medicalVisit;
	}

}
