package awtCrud;
class RectangleShape{
	int length;
	int width;
	
	public RectangleShape() {
		System.out.println("Constructor Is Called.....");
		length=2;
		width=10;
	}
	
	int area() {
		int a = length * width;
		return a;
	}
}

public class Constractor {

	public static void main(String[] args) {
		RectangleShape o1 = new RectangleShape();
		System.out.println("Area Of Rectangle : "+o1.area());
	
	}

}
