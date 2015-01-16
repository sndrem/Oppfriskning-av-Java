import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public class Course implements Serializable {
	private String courseName;
	private int courseRegCode;
	private ArrayList<Person> students;
	private Person instructor;
	private int maxStudents;

	public Course(String courseName, int regCode, int max) {
		this.courseName = courseName;
		courseRegCode = regCode;
		maxStudents = max;
		students = new ArrayList<Person>();
	}

	public void setInstructor(Person instructor) {
		this.instructor = instructor;
	}

	public Instructor getInstructor() {
		return (Instructor) instructor;
	}

	public Person searchPerson(int id) throws StudentNotFoundException {
		Person student = null;
		boolean found = false;
		Iterator<Person> it = students.iterator();

		while (!found && it.hasNext()) {
			Person p = it.next();
			if (p instanceof Registrar) {
				if (p.getID() == id) {
					student = p;
					System.out.println(student.getName()
							+ " was successfully retrieved.");
					found = true;
					return student;
				}
			} else {
				System.out.println("No students available");
			}
		}

		if (!found) {
			throw new StudentNotFoundException();
		}
		return student;
	}

	public void addStudent(Person p) {
		if (students.size() == maxStudents) {
			System.out.println("We are so sorry " + p.getName()
					+ " , but this course is full.");
		} else {
			students.add(p);
			System.out.println(p.getName()
					+ " has successfully enrolled to the course " + courseName);
		}
	}

	public void addStudent(String name, int id) {
		Person p = new Registrar(name, id);
		addStudent(p);
	}

	public void listStudents() {
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i).getName());
		}
	}

	public void removeStudent(Person stud) throws StudentNotFoundException {
		if (students.remove(stud)) {
			System.out.println(stud.getName()
					+ " was successfully removed from the course.");
		} else {
			throw new StudentNotFoundException();
		}

	}

	public String toString() {
		String info = courseName + " has a registration code: " + courseRegCode + " and "
				+ maxStudents + " is the maximum number of students." + "\n";

		if (instructor != null) {
			info += "The instructor is: ";
			info += instructor.getName();
		}
		if (!students.isEmpty()) {
			info += " and the students enrolled are: ";

			for (int i = 0; i < students.size(); i++) {
				info += students.get(i).getName() + " \n";
			}
		}
		return info;
	}

}
