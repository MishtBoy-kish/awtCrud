package awtCrud;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		int num;
		int originalnum;
		int rem;
		int fact;
		int i;
		int sum =0;
		
		
		Scanner in =new Scanner(System.in);
		System.out.println("Enter The Number: ");
		num = in.nextInt();
		originalnum = num;
		while(num>0) {
			rem = num%10;
			fact = 1;
			for(i=1;i<=rem;i++) {
				fact = fact*i;
			}
				sum+=fact;
			num = num/10;
		}
		if(sum==originalnum) {
			System.out.println("It Is A Strong Number");
		}else {
			System.out.println("It Is Not A Strng Number");
		}
	}

}
