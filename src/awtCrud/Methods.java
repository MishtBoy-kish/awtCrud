package awtCrud;
class Method_function{
	//No Return Without Arguments
	public void add() {
		int a=112;
		int b=10;
		System.out.println("Addtion : "+(a+b));
	}
	
	//No Return With Arguments
	public void sub(int x,int y) {
		System.out.println("Subraction : "+(x-y));
	}
	
	//Return With WithoutArguments
	public int mul() {
		int c=5;
		int d=6;
		return(c*d);
	}
	
	//Return With WithArguments
	public float div(int e,int f) {
		return(e/f);
	}
	
	//Recursion Function
	public int factorial(int n) {
		if(n==1)
			return 1;
			else 
				return(n*factorial(n-1));
			
		
	}
}

public class Methods {

	public static void main(String[] args) {
		Method_function o = new Method_function();
		o.add();
		o.sub(350, 50);
		System.out.println("Multiplication : "+(o.mul()));
		System.out.println("Division : "+(o.div(123,10)));
		System.out.println("Factorial : "+o.factorial(5));
		

	}

}
