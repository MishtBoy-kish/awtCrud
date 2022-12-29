package awtCrud;

import java.util.Scanner;

public class Even_odd {

	public static void main(String[] args) {
		int e=0;
		int o=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter The Limit : ");
		int n = in.nextInt();
		int [] a = new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter A ["+i+"] Value : ");
			a[i]=in.nextInt();
		}
		for(int element : a) {
			if(element % 2==0) {
				e++;
			}
			else {
				o++;
			}
		}
			System.out.println("Even Number Are "+e);
			System.out.println("odd Number Are "+o);
			
		}

}
