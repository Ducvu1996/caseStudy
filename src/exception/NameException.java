package exception;

public class NameException extends Exception {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

//	NameException(){
//	}
	public String getMessage() {
		return "Customer's Name must capitalize first letter of each word";
	}
}
