package hospital.medical.record.manament.models;

import javax.validation.constraints.NotBlank;

public class HospitalDTO {

	private long id;

	@NotBlank(message = "Name of a brug is required")
	private String name;

	@NotBlank(message = "logo is required")
	private String logoURL;

	private long addressID;

	public HospitalDTO(long id, @NotBlank(message = "Name of a brug is required") String name,
			@NotBlank(message = "logo is required") String logoURL, long addressID) {
		this.id = id;
		this.name = name;
		this.logoURL = logoURL;
		;
		this.addressID = addressID;
	}

	public HospitalDTO() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogoURL() {
		return logoURL;
	}

	public void setLogoURL(String logoURL) {
		this.logoURL = logoURL;
	}

	public long getAddress() {
		return addressID;
	}

	public void setAddress(long addressID) {
		this.addressID = addressID;
	}

}
