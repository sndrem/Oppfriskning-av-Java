

/**
 * @author Sindre Moldeklev
 * @version 1.0
 * 
 * A class representing a student
 */

public class Registrar extends Person {
	private double credits;
	private double gradePoints;
	
	public Registrar(String name, int id){
		super(name, id);
	}
	
	public String getName(){
		 return super.getName();
	}
	
	public int getID(){
		return super.getID();
	}
	
	public boolean equals(Object x){
		Object student = x;
		boolean result = false;
		
		if(student instanceof Registrar){
			if(((Registrar) student).getID() == super.getID()){
				result = true;
			} else {
				result =  false;
			}
		} else {
			System.out.println("Not correct data type");
		}
		return result;
	}
	
	public void setGradePoints(double gradePoints){
		this.gradePoints = gradePoints;
	}
	
	public double getGradePoints(){
		return gradePoints;
	}
	
	public void setCredit(double credit){
		this.credits = credit;
	}
	
	public double getCredit(){
		return credits;
	}
	
	public double getGPA(){
	
		if(gradePoints <= 0){
			return 0.0;
		} else {
			return gradePoints / credits;
		}
	}
	
}
