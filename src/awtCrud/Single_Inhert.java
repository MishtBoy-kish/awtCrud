package awtCrud;
class Father{//Base
	public void house() {
		System.out.println("Have A Farm Land.....:)");
	}
}

class Son extends Father{//Derived
	public void car() {
		System.out.println("Have A Audi Car.....:)");
	}
}

public class Single_Inhert {

	public static void main(String[] args) {
		Son o = new Son();
		o.car();
		o.house();

	}

}
