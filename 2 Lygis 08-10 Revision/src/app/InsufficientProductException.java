package app;

public class InsufficientProductException extends Exception{
	private Integer remainder;
	
	public InsufficientProductException(String errorMessage, Integer remainder) {
		super(errorMessage);
		this.remainder = remainder;
	}
	
	public Integer getRemainder() {return remainder;}

}
