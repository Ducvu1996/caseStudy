package exception;

public class GenderException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String getMessage() {
		return "Gender must be Male, Female or Unknow";
	}
}
