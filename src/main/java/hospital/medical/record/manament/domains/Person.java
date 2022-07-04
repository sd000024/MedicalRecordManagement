package hospital.medical.record.manament.domains;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;

import hospital.medical.record.manament.constants.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@MappedSuperclass
public class Person {
	
	@NotBlank(message = "Firstname is required")
	@Column(nullable = false)
	private String firstName;
	
	@NotBlank(message = "Lastname is required")
	@Column(nullable = false)
	private String lastName;
	
	@NotBlank(message = "ID card number is required")
	@Column(nullable = false)
	private String IDCardNumber;
	
	@Column
	private String photoURL;
	
	@Column
	private String phoneNumber;
	
	@Column
	private String email;
	
	@NotBlank(message = "Nationality is required")
	@Column(nullable = false)
	private String nationality;
	
	@NotBlank(message = "Gender is required")
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	@OneToOne
	private Address address;
}
