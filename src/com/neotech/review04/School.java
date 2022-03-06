package com.neotech.review04;

public class School {
	
	// Create a class School with a main method
	// Create 2 objects/instances of Student class
	// Create 1 object of Teacher class

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.name = "Ceyda";
		student1.studentNr = 9;
		student1.gradeLevel = 90;
		
		
		Student student2 = new Student();
		student2.name = "Nick";
		student2.studentNr = 12;
		student1.gradeLevel = 100;
		
		student2.study();
		student2.sleep();
		
		Teacher teacher1 = new Teacher();
		teacher1.name = "Elion";
		teacher1.salary = 10000;
		teacher1.subject = "Java";
		
		System.out.println("Let's call the methods");
		
		student1.study();
		student1.sleep();
		
		
		teacher1.yellAtStudent(student1.name);
		teacher1.teach();
		
	}

}
