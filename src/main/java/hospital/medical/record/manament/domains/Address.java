package hospital.medical.record.manament.domains;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank(message = "Region is required")
	@Column(nullable = false)
	private String region;
	
	@NotBlank(message = "Region is required")
	@Column(nullable = false)
	private String city;
	
	@Column(nullable = true)
	private String street;
	
	@Column(nullable = true)
	private String house;
	

}
