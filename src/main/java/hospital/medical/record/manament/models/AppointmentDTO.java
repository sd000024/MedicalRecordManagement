package hospital.medical.record.manament.models;

import java.time.LocalDateTime;

import javax.validation.constraints.NotNull;

public class AppointmentDTO {

	private String id;

	@NotNull(message = "Patient is required")
	private PatientDTO patient;

	@NotNull(message = "Doctor is required")
	private String doctorID;

	@NotNull(message = "date and time are required")
	private LocalDateTime dateAndTime;

	@NotNull(message = "the reason of appointment is required")
	private String comment;

	@NotNull(message = "The hospital is required")
	private long hospitalID;

	public AppointmentDTO() {
	}

	public AppointmentDTO(String id, @NotNull(message = "Patient is required") PatientDTO patient,
			@NotNull(message = "Doctor is required") String doctorID,
			@NotNull(message = "date and time are required") LocalDateTime dateAndTime,
			@NotNull(message = "the reason of appointment is required") String comment,
			@NotNull(message = "The hospital is required") long hospitalID) {
		this.id = id;
		this.patient = patient;
		this.doctorID = doctorID;
		this.dateAndTime = dateAndTime;
		this.comment = comment;
		this.hospitalID = hospitalID;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public PatientDTO getPatient() {
		return patient;
	}

	public void setPatient(PatientDTO patient) {
		this.patient = patient;
	}

	public String getDoctorID() {
		return doctorID;
	}

	public void setDoctorID(String doctorID) {
		this.doctorID = doctorID;
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

	public long getHospitalID() {
		return hospitalID;
	}

	public void setHospitalID(long hospitalID) {
		this.hospitalID = hospitalID;
	}

}
