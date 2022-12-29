package awtCrud;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		int reverse = 0;
	    int rem;
		Scanner kish = new Scanner(System.in);
		System.out.println("Enter The Values : ");
		int n = kish.nextInt();
		int t = n;
		while(n>0) {
			rem=n%10;
			reverse = (reverse*10)+rem;
		    n=n/10;
		}
		System.out.println("The Reversed Number "+reverse);
		if(t==reverse)
		{
			System.out.println("the given is palin");
		}
		else
		{
			System.out.println("the given is not palin");
		}
	}

}
