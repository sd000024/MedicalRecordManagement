package hospital.medical.record.manament.models;

import javax.validation.constraints.NotBlank;

public class AddressDTO {

	private long id;

	@NotBlank(message = "Region is required")
	private String region;

	@NotBlank(message = "Region is required")
	private String city;

	private String street;

	private String house;

	public AddressDTO() {
	}

	public AddressDTO(long id, @NotBlank(message = "Region is required") String region,
			@NotBlank(message = "Region is required") String city, String street, String house) {
		this.id = id;
		this.region = region;
		this.city = city;
		this.street = street;
		this.house = house;
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
