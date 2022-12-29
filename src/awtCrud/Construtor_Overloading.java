package awtCrud;
class Box{
	float length;
	float breath;
	
	public Box(){//Default 
		length=2;
		breath=5;
	}
	public Box(float x,float y){//Parameterized
		length=x;
		breath=y;
	}
	
	Box(float x){
		length=breath=x;
	}
	
	float area() {
		return length * breath;
	}
}

public class Construtor_Overloading{

	public static void main(String[] args) {
    Box o =new Box();
    System.out.println("Area : "+o.area());
    
    Box o1 =new Box(2,9);
    System.out.println("Area : "+o1.area());
    
    Box o2 =new Box(3);
    System.out.println("Area : "+o2.area());
	}

}
