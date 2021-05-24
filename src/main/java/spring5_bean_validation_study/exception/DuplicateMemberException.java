package spring5_bean_validation_study.exception;

@SuppressWarnings("serial")
public class DuplicateMemberException extends RuntimeException {
	
	public DuplicateMemberException(String message) {
		super(message);
	}
}
