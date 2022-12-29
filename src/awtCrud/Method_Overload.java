package awtCrud;

class user{
     String name;
     int age;
     user(String n,int a){
    	this.name=n;
    	this.age=a;
     }
     public void display() {
    	 System.out.println("Name : "+name);
    	 System.out.println("Age  : "+age);
     }
}

class MainProgrammer extends user{
	String CompanyName;
	MainProgrammer(String n,int a,String c){
		super(n,a);
		this.CompanyName=c; 
	}
	 public void display() {
    	 System.out.println("Name         : "+name);
    	 System.out.println("Age          : "+age);
    	 System.out.println("Company Name : "+CompanyName);
     }
}

public class Method_Overload {

	public static void main(String[] args) {
		MainProgrammer o = new MainProgrammer("Kishore",20,"TringApps");
		o.display();
		
		MainProgrammer o1 = new MainProgrammer("Kichu",22,"TringApps");
		o1.display();

		
	}

}
