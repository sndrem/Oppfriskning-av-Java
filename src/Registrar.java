
public class Registrar extends Person {
	private int credits;
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
	
	public void setCredit(int credit){
		this.credits = credit;
	}
	
	public int getCredit(){
		return credits;
	}
	
	public double getGPA(){
		if(gradePoints <= 0){
			return credits;
		} else {
			return gradePoints / credits;
		}
	}
	
}
