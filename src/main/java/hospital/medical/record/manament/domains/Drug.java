package hospital.medical.record.manament.domains;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Drug {

	@Id
	private long id;

	@NotBlank
	@Column(nullable = false)
	@NotBlank(message = "info is required")
	private String name;

	@Column(columnDefinition = "TEXT", nullable = false)
	@NotBlank(message = "info is required")
	private String info;

	public Drug() {
	}

	public Drug(long id, @NotBlank @NotBlank(message = "info is required") String name,
			@NotBlank(message = "info is required") String info) {
		this.id = id;
		this.name = name;
		this.info = info;
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

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

}
