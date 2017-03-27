package sdong.function_analysis.NumberClassifier;

public class ProjectException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -876867516326270629L;

	private String reason;

	public ProjectException(String message) {
		super(message);
		this.reason = "Get error : " + message;
	}

	public String getMessage() {
		return reason;
	}

}