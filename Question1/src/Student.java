
public class Student extends Person {
	
	
	private final String STATUS;
	public static int numberofStudents;
	
	public Student (String s){
	
		STATUS=s;
		numberofStudents++;
		
	}

	public String getSTATUS() {
		return STATUS;
	}

	public int getNumberofStudents() {
		return numberofStudents;
	}

	public void setNumberofStudents(int numberofStudents) {
		this.numberofStudents = numberofStudents;
	}
	public String toString(){
		return "Student: " + getName();
	}
}
