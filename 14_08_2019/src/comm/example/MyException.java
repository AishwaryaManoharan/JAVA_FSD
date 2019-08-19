package comm.example;

public class MyException extends Throwable {

	private String message;
	private static final long serialVersionID=1L;
	
	public MyException()
	{
		super();
	}
	
	public MyException(String message) {
		super();
		this.setMessage(message);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
