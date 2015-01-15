import java.util.ArrayList;


public class Course {
	private String courseName;
	private int courseRegCode;
	private ArrayList<Person> students;
	private Person instructor;
	private int maxStudents;
	
	public Course(String courseName, int regCode, int max){
		this.courseName = courseName;
		courseRegCode = regCode;
		maxStudents = max;
		students = new ArrayList<Person>();
	}
	
	public void setInstructor(Person instructor){
		this.instructor = instructor;
	}
	
	public Instructor getInstructor(){
		return (Instructor) instructor;
	}
	
	public Person searchPerson(int id) throws StudentNotFoundException{
		Person student = null;
		for (Person p : students){
			if(p instanceof Registrar){
				if(p.getID() == id){
					student = p;	
					System.out.println(student.getName() + " was successfully retrieved.");
					return student;
				} else {
					//System.out.println("Could not find any students with the id: " + id);
					throw new StudentNotFoundException();
				}
			} else {
				System.out.println("No students available");
			}
		}
		return student;
	}
	
	public void addStudent(Person p){
		if(students.size() == maxStudents){
			System.out.println("We are so sorry " + p.getName() + " , but this course is full.");
		} else {
			students.add(p);
			System.out.println(p.getName() + " has successfully enrolled to the course " + courseName);
		}
	}
	
	public void listStudents(){
		for(int i = 0; i < students.size(); i++){
			System.out.println(students.get(i).getName());
		}
	}
}