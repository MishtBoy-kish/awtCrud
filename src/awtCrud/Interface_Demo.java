package awtCrud;
interface Animal{
	void sound();
	void sleep();
}
class Dog implements Animal{

	@Override
	public void sound() {
		System.out.println("Sounds Like Hoof :)");
	}

	@Override
	public void sleep() {
		System.out.println("Deeply Sleep........:)");
	}
	
}
public class Interface_Demo {

	public static void main(String[] args) {
		Dog o = new Dog();
		o.sleep();
		o.sound();
		}

}
