package exception;

public class IdCardException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String getMessage() {
		return "The Id Card must have 9 digits and must be in the format XXX XXX XXX ";
	}
}
