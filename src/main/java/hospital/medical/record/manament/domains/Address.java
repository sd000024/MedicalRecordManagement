package hospital.medical.record.manament.domains;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

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

	public Address(long id, @NotBlank(message = "Region is required") String region,
			@NotBlank(message = "Region is required") String city, String street, String house) {
		this.id = id;
		this.region = region;
		this.city = city;
		this.street = street;
		this.house = house;
	}

	public Address() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getHouse() {
		return house;
	}

	public void setHouse(String house) {
		this.house = house;
	}

}
