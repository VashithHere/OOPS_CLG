package PracticalLab;
import java.util.ArrayList;
import java.util.*;

import java.util.Scanner;

class studentInfo{
	private String name;
	private int rollNo;
	private ArrayList<String> course;
	
	studentInfo(String name, int rollNo,course list){
		course = new ArrayList<>();
		this.name = name;
		this.rollNo = rollNo;
		this.course = list.addCourses(course);
	}
	
	public String getName() {
		return name;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("RollNo: "+rollNo);
		System.out.println();
		System.out.println("Courses List: ");
		
		for(String cour: course) {
			System.out.println(cour);
		}
	}
}

class course{
	ArrayList<Integer> list;
	
	course(ArrayList<Integer> list){
		this.list = list;
	}
	
	public ArrayList<String> addCourses(ArrayList<String> course) {
		for(int val : list) {
			if(val==1) {
				course.add("Operating System");
			}else if(val==2) {
				course.add("Data Base Management System");
			}else if(val==3) {
				course.add("Artificial Intelligence and Machine Learning");
			}else if(val==4) {
				course.add("Object Oriented Programming");
			}
		}
		
		return course;
	}
}

public class Q2 {
	
	static HashMap<Integer,studentInfo> studentList = new HashMap<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int schoice;
		do {
			
			System.out.println("Enter your name");
			String name = sc.nextLine();
			System.out.println("Enter your Roll NO");
			int rollNo = sc.nextInt();
			
			
			System.out.println("Select the Courses: ");
			System.out.println("1: Operating System");
			System.out.println("2: Data Base Management System");
			System.out.println("3: Artificial Intelligence and Machine Learning");
			System.out.println("4: Object Oriented Programming");
			System.out.println("5: Exit");
			
			int choice = sc.nextInt();
			ArrayList<Integer> list = new ArrayList<>();
			while(choice!=5) {
				list.add(choice);
				choice = sc.nextInt();
			}
			
			
			course obj = new course(list);
			studentInfo s1 = new studentInfo(name,rollNo,obj);
			studentList.put(rollNo,s1);
			
			System.out.println("Do you want to add other students: (1/0)");
			schoice = sc.nextInt();
			sc.nextLine();
		}while(schoice==1);
		
		for(studentInfo obj1 : studentList.values()) {
			obj1.display();
			System.out.println("- - - - - - - - - - - - - -");
		}
	}
}
