package awtCrud;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		String ch ;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter The Operator: ");
//		 ch=in.next().charAt(0);
		
		 ch=in.nextLine();
		System.out.println("Enter The Value Of A:");
		a=in.nextInt();
		System.out.println("Enter The Value Of B:");
		b=in.nextInt();
		
		
		switch(ch) {
		case "Addition":
		case "addition":
		case "Add":
		case "add":
		case "+":
			c=a+b;
			System.out.println("Addtion: "+c);
			break;
		
		case "Subraction":
		case "subraction":
		case "Sub":
		case "sub":
		case "-":
			c=a-b;
			System.out.println("Subraction: "+c);
			break;
			
		case "Multiplication":
		case "multiplication":
		case "Mul":
		case "mul":
		case "*":
			c=a*b;
			System.out.println("Multiplication: "+c);
			break;
			
		case "Division":
		case "division":
		case "Div":
		case "div":
		case "/":
			c=a/b;
			System.out.println("Division: "+c);
			break;	
		}
	}
}


	
