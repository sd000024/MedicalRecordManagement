package hospital.medical.record.manament.domains;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Appointment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@ManyToOne
	@NotNull(message = "Patient is required")
	private Patient patient;

	@ManyToOne
	@NotNull(message = "Doctor is required")
	private Doctor doctor;

	@NotNull(message = "date and time are required")
	@Column(nullable = false)
	private LocalDateTime dateAndTime;

	@Column(columnDefinition = "TEXT", nullable = false)
	@NotNull(message = "the reason of appointment is required")
	private String comment;

	@ManyToOne
	@NotNull(message = "The hospital is required")
	private Hospital hospital;

	public Appointment(long id, @NotNull(message = "Patient is required") Patient patient,
			@NotNull(message = "Doctor is required") Doctor doctor,
			@NotNull(message = "date and time are required") LocalDateTime dateAndTime,
			@NotNull(message = "the reason of appointment is required") String comment,
			@NotNull(message = "The hospital is required") Hospital hospital) {
		this.id = id;
		this.patient = patient;
		this.doctor = doctor;
		this.dateAndTime = dateAndTime;
		this.comment = comment;
		this.hospital = hospital;
	}

	public Appointment() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public LocalDateTime getDateAndTime() {
		return dateAndTime;
	}

	public void setDateAndTime(LocalDateTime dateAndTime) {
		this.dateAndTime = dateAndTime;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Hospital getHospital() {
		return hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}

}
