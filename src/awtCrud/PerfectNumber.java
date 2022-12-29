package awtCrud;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int n = in.nextInt();
		int sum=0;
		for(int i =1;i<n;i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
		if(sum==n) {
			System.out.println("It Is A Perfect Number");
		}
		else {
			System.out.println("It Is A Not Perfect Number");
		}
	}
}
    
 

