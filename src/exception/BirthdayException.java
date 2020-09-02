package exception;

public class BirthdayException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String getMessage() {
		return "Birthday does not match the format ";
	}
}
