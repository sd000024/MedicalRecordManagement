package hospital.medical.record.manament.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code=HttpStatus.NOT_FOUND, reason = "User Existed")
public class UserDoesNoTExistException extends RuntimeException {
	
	private static final long serialVersionUID = -2436390799028205334L;

	private String message;

	public UserDoesNoTExistException(String message) {
		super(message);
		this.message = message;
	}
	
	public UserDoesNoTExistException() {
	}

	@Override
	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
