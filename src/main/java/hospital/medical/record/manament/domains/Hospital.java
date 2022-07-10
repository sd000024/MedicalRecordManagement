package hospital.medical.record.manament.domains;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;

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
	private List<Administration> staff;

	@OneToOne
	private Address address;

	public Hospital(long id, @NotBlank(message = "Name of a brug is required") String name,
			@NotBlank(message = "logo is required") String logoURL, Address address) {
		this.id = id;
		this.name = name;
		this.logoURL = logoURL;
		this.doctors = new ArrayList<Doctor>();
		this.staff = new ArrayList<Administration>();
		;
		this.address = address;
	}

	public Hospital() {
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

	public List<Doctor> getDoctors() {
		return doctors;
	}

	public void setDoctors(List<Doctor> doctors) {
		this.doctors = doctors;
	}

	public List<Administration> getStaff() {
		return staff;
	}

	public void setStaff(List<Administration> staff) {
		this.staff = staff;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
