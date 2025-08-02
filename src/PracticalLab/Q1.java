package PracticalLab;
import java.util.Scanner;

class student{
	String name;
	int rollNo;
	int marks[];
	
	student(String name, int rollNo, int marks[]){
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
	}
	
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Roll No: "+rollNo);
		System.out.print("Marks: ");
		for(int i=0; i<5; i++) {
			System.out.print(marks[i]+" ");
		}
	}
}

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		int rollNo = sc.nextInt();
		int arr[] = new int[5];
		
		for(int i=0; i<5; i++) {
			arr[i] = sc.nextInt();
		}
		
		student obj = new student(name,rollNo,arr);
		obj.display();
	}

}
