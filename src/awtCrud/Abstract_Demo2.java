package awtCrud;
abstract class Mobile{
	void voicecall() {
		System.out.println("Make A Phone Call :)");
	}
	abstract void camera();
	abstract void display();
}

class Oppo extends Mobile{
	@Override
	void camera() {
		System.out.println("16 MegaPixel Camera...");
	}
	@Override
	void display() {
		System.out.println("5.5 Ammold Display...");
	}
}

class Iqoo extends Mobile{
	@Override
	void camera() {
		System.out.println("32 MegaPixel Camera...");
	}
	@Override
	void display() {
		System.out.println("6.6 Ammold Display...");
	}
	void torchlight() {
		System.out.println("Access Torch Light...");
	}
}
public class Abstract_Demo2 {

	public static void main(String[] args) {
		Oppo A5 = new Oppo();
		A5.voicecall();
		A5.camera();
		A5.display();
		
		System.out.println("-----------------------------------------------------");
		
		Iqoo Neo6 = new Iqoo();
		Neo6.voicecall();
		Neo6.camera();
		Neo6.display();
		Neo6.torchlight();
	}

}
