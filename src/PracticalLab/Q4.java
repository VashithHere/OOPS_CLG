package PracticalLab;

class Person {
    String name;
    int id;
    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    public void display() {
    	System.out.println("Person Information");
    	System.out.println("Name: "+name);
    	System.out.println("Id: "+id);
    }
}

class Admin extends Person {
    String department;

    Admin(String name, int id, String department) {
        super(name, id);
        this.department = department;
    }
    
    @Override
    public void display() {
    	System.out.println("Admin Information");
    	System.out.println("Name: "+name);
    	System.out.println("Id: "+id);
    	System.out.println("Department: "+department);
    }
}

class Students extends Person {
    String course;

    Students(String name, int id, String course) {
        super(name, id);
        this.course = course;
    }
    
    @Override
    public void display() {
    	System.out.println("Student Information");
    	System.out.println("Name: "+name);
    	System.out.println("Id: "+id);
    	System.out.println("Course: "+course);
    }
}

class Faculty extends Person {
    String subject;

    Faculty(String name, int id, String subject) {
        super(name, id);
        this.subject = subject;
    }
    
    @Override
    public void display() {
    	System.out.println("Faculty Information");
    	System.out.println("Name: "+name);
    	System.out.println("Id: "+id);
    	System.out.println("Subject: "+subject);
    }

}

public class Q4 {

	public static void main(String[] args) {
		
		Admin aobj = new Admin("Rahul",002,"Computers");
		aobj.display();
		Students sobj = new Students("Varshith",452,"CSE");
		sobj.display();
		Faculty fobj = new Faculty("Kiran",114,"OOP's");
		fobj.display();

	}

}
