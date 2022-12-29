package awtCrud;

class Student{
	public int rollno;
	public String name;
	
   Student(int rollno,String name){
	   this.rollno = rollno;
	   this.name = name;
   }
   void print(){
	   System.out.println("Name : "+name);
	   System.out.println("Roll No : "+rollno);
	   System.out.println("--------------------------");
   }
}

public class Array_Object {

	public static void main(String[] args) {
		Student[] arr ;
		arr = new Student[6];
		arr[0] = new Student(1,"Kishore");
		arr[1] = new Student(2,"Priya");
		arr[2] = new Student(3,"Pandi");
		arr[3] = new Student(4,"Chakara");
		arr[4] = new Student(5,"Vishwa");
		arr[5] = new Student(6,"Monika");
for(int i=0;i<arr.length;i++) {
	arr[i].print();
}
	}

}
