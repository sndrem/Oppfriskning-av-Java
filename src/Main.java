
public class Main {
	
	public static void main(String[] args) {
		Person sindre = new Registrar("Sindre Moldeklev", 1234);
		Person einar = new Registrar("Einar Søreide", 1111);
		Person haakon = new Registrar("Håkon Roald", 3333);
		
		Person ken = new Instructor("Ken-Thomas Nilsen", 666);
		
		Course info216 = new Course("INFO216", 116, 35);
		
		info216.setInstructor(ken);
		
		info216.addStudent(sindre);
		info216.addStudent(einar);
		info216.addStudent(haakon);
		
		try{
			Person p = info216.searchPerson(123);
		} catch (StudentNotFoundException e){
			e.printStackTrace();
		} 
		
		//info216.listStudents();
		
		
		
		
		
	}
}

