package awtCrud;

class shape{
	float length;
	float breath;
	float radius;
}

class rect extends shape{
	public rect(float l,float b) {
		length=l;
		breath=b;
	}
	float rectangle_area() {
		return length * breath;
	}
}

class circle extends shape{
	public circle(float r) {
		radius = r;
	}
	float circle_area() {
		return 3.14f * (radius * radius);
	}
}

class square extends shape{
	public square(float l) {
		length = l;
	}
	float square_area() {
		return (length * length);
	}
}

public class Hierachi_inhe {

	public static void main(String[] args) {
		rect o1 = new rect(2,5);
		System.out.println("Area Of Rectangle : "+o1.rectangle_area());
		
		circle o2 = new circle(5);
		System.out.println("Area Of Circle : "+o2.circle_area());
		
		square o3 = new square(8);
		System.out.println("Area Of Square : "+o3.square_area());
	}

}
