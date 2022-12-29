package awtCrud;

import java.util.Scanner;

public class Fibonocci {

	public static void main(String[] args) {
		int a=-1;
		int b=1;
		int c;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter The Limit : ");
		int n = in.nextInt();
		
		for(int i=1;i<=n;i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		
	}

}
