package awtCrud;
class outercls{
	void display() {
		class Inner{
			void innerDisplay() {
				System.out.println("Inner Display");
			}
		}
		Inner i = new Inner();
		i.innerDisplay();
	}
}

public class Local_Inner {

	public static void main(String[] args) {
	outercls o = new outercls();
	o.display();
	}

}
