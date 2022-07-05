package hospital.medical.record.manament.models;

public class ModelApiResponse {

	private Integer code = null;

	private String type = null;

	private String message = null;

	public ModelApiResponse(Integer code, String type, String message) {
		this.code = code;
		this.type = type;
		this.message = message;
	}

	public ModelApiResponse() {
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
