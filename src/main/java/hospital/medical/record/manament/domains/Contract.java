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

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
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

}
