package hospital.medical.record.manament.models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;


public class MedicalVisitDTO {

	private long id;

	private List<String> diagonsises;

	private List<PrescriptionDTO> prescriptionDTO;

	private List<String> symptoms;

	@NotNull(message = "Date cannot be null")
	private LocalDateTime date;

	@NotNull(message = "Doctor cannot be null")
	private String doctorID;

	@NotNull(message = "Patient cannot be null")
	private String patientID;

	private String comments;

	public MedicalVisitDTO(long id, @NotNull(message = "Date cannot be null") LocalDateTime date,
			@NotNull(message = "Doctor cannot be null") String doctorID,
			@NotNull(message = "Patient cannot be null") String patientID, String comments) {
		this.id = id;
		this.diagonsises = new ArrayList<>();
		this.prescriptionDTO = new ArrayList<>();
		this.symptoms = new ArrayList<>();
		this.date = date;
		this.doctorID = doctorID;
		this.patientID = patientID;
		this.comments = comments;
	}

	public MedicalVisitDTO() {
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

	public List<PrescriptionDTO> getPrescription() {
		return prescriptionDTO;
	}

	public void setPrescription(List<PrescriptionDTO> prescriptionDTO) {
		this.prescriptionDTO = prescriptionDTO;
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

	public String getDoctorID() {
		return doctorID;
	}

	public void setDoctorID(String doctorID) {
		this.doctorID = doctorID;
	}

	public String getPatientID() {
		return patientID;
	}

	public void setPatientID(String patientID) {
		this.patientID = patientID;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

}
