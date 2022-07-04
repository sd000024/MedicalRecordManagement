package hospital.medical.record.manament.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code=HttpStatus.CONFLICT, reason = "User Existed")
public class UserExistedException extends RuntimeException {
	private static final long serialVersionUID = -2993223110726255009L;

	private String message;

	public UserExistedException(String message) {
		super(message);
		this.message = message;
	}

	public UserExistedException() {}
	
	
	@Override
	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
