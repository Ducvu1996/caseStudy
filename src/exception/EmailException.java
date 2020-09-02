package exception;

public class EmailException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String getMessage() {
		return "Email have to include only @ and at least a dot ";
	}
}
