
public class Main {
	
	public static void main(String[] args) {
		
		/*
		Registrar sindre = new Registrar("Sindre Moldeklev", 1234);
		Registrar einar = new Registrar("Einar Søreide", 1111);
		Registrar haakon = new Registrar("Håkon Roald", 3333);
		
		sindre.setCredit(5.0);
		sindre.setGradePoints(10);
		System.out.print("Sindres gpa is: ");
		System.out.println(sindre.getGPA());
		
		Person ken = new Instructor("Ken-Thomas Nilsen", 666);
		
		Course info216 = new Course("INFO216", 116, 35);
		
		info216.setInstructor(ken);
		
		info216.addStudent(sindre);
		info216.addStudent(einar);
		info216.addStudent(haakon);
		
		
		InputOutput sc = new InputOutput();
		sc.save(info216, "courseTest");
		info216 = (Course) sc.read("courseTest.dat");
		
		try{
			Person p = info216.searchPerson(3333);
		} catch (StudentNotFoundException e){
			e.printStackTrace();
		} 
		
		
		try{
			Person p = info216.searchPerson(1234);
			info216.removeStudent(p);
		}  catch (StudentNotFoundException e){
			e.printStackTrace();
		}
		
		System.out.println("\nThese are the current students of the course");
		info216.listStudents();
		*/
		
		University uni = new University("Universitet i Bergen");
			
		
	}
}

