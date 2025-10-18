package privatestudent;

import java.util.ArrayList;



public class StudentManagement {
	
	private ArrayList<privateStudent>students;
	
	public StudentManagement() {
		students = new ArrayList<>();
	}
	
	public void addStudent(String name ,String email) {
		privateStudent newStudent = new privateStudent(name);
		students.add(newStudent);
		System.out.println("Öğrenci Başarıyla Eklendi. "+ newStudent.toString());

}}
