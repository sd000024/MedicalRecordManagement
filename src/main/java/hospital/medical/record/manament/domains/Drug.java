package hospital.medical.record.manament.domains;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Drug {

	@Id
	private String id;
	
	@NotBlank
	@Column(nullable = false)
	@NotBlank(message = "info is required")
	private String name;
	
	@Column(columnDefinition="TEXT", nullable = false)
	@NotBlank(message = "info is required")
	private String info;
}
