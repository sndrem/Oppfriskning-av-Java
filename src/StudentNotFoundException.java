
public class StudentNotFoundException extends Exception {
	
	String message = "We could not find the student you were looking for.";
	
	public StudentNotFoundException(){
		
	}
	
	public String toString(){
		return message;
	}
	
	public void printStackTrace(){
		System.out.println(message);
	}
	
}
