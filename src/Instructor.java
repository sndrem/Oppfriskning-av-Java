
public class Instructor extends Person {
	private String department;
	
	public Instructor(String name, int id){
		super(name, id);
	}
	
	public void setDepartment(String dep){
		department = dep;
	}
	
	public String getDepartment(){
		return department;
	}
}
