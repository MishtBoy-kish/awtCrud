package awtCrud;
class Complex{
	private int real;
	private int img;
	
//	public void meal() {
//		System.out.println("Elumali");
//	}
	
	public Complex() {
		this.real=5;
		this.img=2;
	}
	
	public Complex(int r,int i) {
		this.real=r;
		this.img=i;
	}
	
	public Complex(Complex o2) {
		this.real=o2.real;
		this.img=o2.img;
	}
	
	public String toString() {
		return"("+real+"+"+img+"i)";
	}
}

public class Copy_Constructor {
	public static void main(String args[]) {
Complex o1 = new Complex();
System.out.println("Object 1 : "+o1);

Complex o2 = new Complex(3,2);
System.out.println("Object 2 : "+o2);

Complex o3 = new Complex(o2);
System.out.println("Object 3 : "+o3);

//o3.meal();

}
}