package hospital.medical.record.manament.domains;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import hospital.medical.record.manament.util.StringListConverter;

@Entity
public class MedicalVisit {

	@Id
	private long id;

	@Convert(converter = StringListConverter.class)
	private List<String> diagonsises;

	@OneToMany(mappedBy = "medicalVisit")
	private List<Prescription> prescription;

	@Convert(converter = StringListConverter.class)
	@Column(columnDefinition = "TEXT", nullable = false)
	private List<String> symptoms;

	@NotNull(message = "Date cannot be null")
	@Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private LocalDateTime date;

	@ManyToOne
	@NotNull(message = "Doctor cannot be null")
	private Doctor doctor;

	@ManyToOne
	@NotNull(message = "Patient cannot be null")
	private Patient patient;

	@Column(columnDefinition = "TEXT")
	private String comments;

	public MedicalVisit(long id, @NotNull(message = "Date cannot be null") LocalDateTime date,
			@NotNull(message = "Doctor cannot be null") Doctor doctor,
			@NotNull(message = "Patient cannot be null") Patient patient, String comments) {
		this.id = id;
		this.diagonsises = new ArrayList<>();
		this.prescription = new ArrayList<>();
		this.symptoms = new ArrayList<>();
		this.date = date;
		this.doctor = doctor;
		this.patient = patient;
		this.comments = comments;
	}

	public MedicalVisit() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<String> getDiagonsises() {
		return diagonsises;
	}

	public void setDiagonsises(List<String> diagonsises) {
		this.diagonsises = diagonsises;
	}

	public List<Prescription> getPrescription() {
		return prescription;
	}

	public void setPrescription(List<Prescription> prescription) {
		this.prescription = prescription;
	}

	public List<String> getSymptoms() {
		return symptoms;
	}

	public void setSymptoms(List<String> symptoms) {
		this.symptoms = symptoms;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

}
