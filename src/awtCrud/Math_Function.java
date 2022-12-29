package awtCrud;

public class Math_Function {

	public static void main(String[] args) {
		System.out.println("Absoulte Value : "+ Math.abs(-45));
		System.out.println("Round    Value : "+ Math.round(5.563));
		System.out.println("Ceil     Value : "+ Math.ceil(2.345));
		System.out.println("Floor    Value : "+ Math.floor(2.678));
		
		double a=2;
		double b=3;
		System.out.println("Maxium Value Of A And B : "+Math.max(a, b));
		System.out.println("Squareroot Of B         : "+Math.sqrt(b));
		System.out.println("Power Of A And B        : "+Math.pow(a,b));
		
		System.out.println("Log Of A                : "+Math.log(a));
		System.out.println("Log10 Of A              : "+Math.log10(a));
		System.out.println("Sine Of A               : "+Math.sin(a));
		System.out.println("Cosine Of A             : "+Math.cos(a));
		System.out.println("Tangent Of A            : "+Math.tan(a));
		
		
	}

}
