package awtCrud;
class Rectangle{
	int length;
	int width;
	
	void getDetails(int x,int y) {
		length=x;
		width=y;
	}
	int area() {
		int a = length*width;
		return a;
	}
}

public class Class_object {

	public static void main(String[] args) {
		Rectangle o1 = new Rectangle();
		o1.length=10;
		o1.width=20;
		System.out.println("Area Of Rectangle : "+o1.area());
		
		Rectangle o2 = new Rectangle();
		o2.getDetails(20, 30);  
		System.out.println("Area Of Rectangle : "+o2.area());
	}

}
