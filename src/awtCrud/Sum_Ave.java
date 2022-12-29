package awtCrud;

import java.util.Scanner;

public class Sum_Ave {

	public static void main(String[] args) {
		int sum=0;
		int a;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter The Limit : ");
		int n = in.nextInt();
		
		for(int i=1;i<=n;i++) {
			System.out.println("Enter The Number "+i+":");
			a= in.nextInt();
			sum+=a;
		}
		System.out.println("The Sum Of Given Numbers is: "+sum);
		System.out.println("The Average Number Is : "+sum/n);

	}

}
