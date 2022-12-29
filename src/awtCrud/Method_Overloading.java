package awtCrud;
class MathOperation{
	public static int multiply(int a,int b) {
		return a*b;
	}
	public static double multiply(double x,double y) {
		return x*y;
	}
	public static double multiply(double i,int j) {
		return i*j;
	}
	public static int multiply(int r) {
		return r*r;
	}
	
}

public class Method_Overloading {

	public static void main(String[] args) {
		System.out.println("Integer Value : "+MathOperation.multiply(12,10));
		System.out.println("Double   Value : "+MathOperation.multiply(2.5,9.7));
		System.out.println("Double And Integer Value : "+MathOperation.multiply(5.6,10));
		System.out.println("Float Value : "+MathOperation.multiply(3));

 


	}

}
