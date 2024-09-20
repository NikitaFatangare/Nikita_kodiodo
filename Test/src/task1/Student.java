package task1;

import java.util.ArrayList;
import java.util.List;

public class Student {

	 int  roll;
	 String name;
	 double marks;
	
	 public Student(int roll, String name, double marks) {
			super();
			this.roll = roll;
			this.name = name;
			this.marks = marks;
		}
	
	
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}



	Student s1=new Student(1,"abc",60.50);
	Student s2=new Student(1,"pqr",70.50);
	
	public static void main(String[] args) {
	
	List<Student> al=new ArrayList<Student>();
		      al.add(s1);
		      al.add(s2);
	}			  
}


