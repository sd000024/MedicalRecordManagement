package hospital.medical.record.manament.domains;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Appointment {

	@Id
	private String id;
	
	@ManyToOne
	@NotNull(message = "Patient is required")
	private Patient patient;
	
	@ManyToOne
	@NotNull(message = "Doctor is required")
	private Doctor doctor;
	
	@NotNull(message = "date and time are required")
	@Column(nullable = false)
	private LocalDateTime dateAndTime;
	
	@Column(columnDefinition="TEXT", nullable = false)
	@NotNull(message = "the reason of appointment is required")
	private String comment;
	
	@ManyToOne
	@NotNull(message = "The hospital is required")
	private Hospital hostal;
}
