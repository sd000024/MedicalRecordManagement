package hospital.medical.record.manament.models;

import javax.validation.constraints.NotBlank;

public class DrugDTO {

	private long id;

	@NotBlank(message = "info is required")
	private String name;

	@NotBlank(message = "info is required")
	private String info;

	public DrugDTO() {
	}

	public DrugDTO(long id, @NotBlank @NotBlank(message = "info is required") String name,
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
