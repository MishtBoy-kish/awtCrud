package awtCrud;
abstract class shape{
	abstract void draw();
	void message() {
		System.out.println("Message From Shape :)");
	}
}
class rectangle extends shape{

	@Override
	void draw() {
		System.out.println("Draw Rectangle Using Length And Breath :)");
		
	}
	
}

public class Abstract_Demo {

	public static void main(String[] args) {
		rectangle o = new rectangle();
		o.draw();
		o.message();
	}

}
