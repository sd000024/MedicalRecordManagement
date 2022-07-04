package hospital.medical.record.manament.domains;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
public class Hospital {
	
	@Id
	private long id;
	
	@Column(nullable = false)
	@NotBlank(message = "Name of a brug is required")
	private String name;
	
	@Column(nullable = false)
	@NotBlank(message = "logo is required")
	private String logoURL;
	
	@OneToMany(mappedBy = "hospital")
	private List<Doctor> doctors;
	
	@OneToMany(mappedBy = "hospital")
	private List<Admistration> staff;
	
	@OneToOne
	private Address address;

}
