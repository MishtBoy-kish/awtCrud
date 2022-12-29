package awtCrud;
abstract class testdemo{
	abstract void display();
}

class outerdemo{
	public void Outerdisplay() {
		testdemo o = new testdemo() {

			@Override
			void display() {
            System.out.println("Test Display");				
			}
			
		};
		o.display();
	}
}


public class Anonymous_Inner {

	public static void main(String[] args) {
		outerdemo o = new outerdemo();
		o.Outerdisplay();
	}

}
