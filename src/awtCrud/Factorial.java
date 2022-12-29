package awtCrud;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter The Value: ");
		int n = in.nextInt();
		int f=1;
		for(int i=1;i<=n;i++) {
			f=f*i;
		}
		System.out.println("Factorial Of " + n+" is "+f);
	}

}
