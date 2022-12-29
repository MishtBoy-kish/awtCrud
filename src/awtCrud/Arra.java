package awtCrud;

import java.util.Scanner;

public class Arra {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60,70,80,90,100};
		//Accessing Elements In Array
		System.out.println(a[1]);
		//Print All Elements Using For Loop
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		//Print All Elements Using Enhanced For Loop
		for(int element : a) {
			System.out.println(element);
		}
		
		int b[];//Declaring Array
		b=new int[10];//Allocating Memory In Array
		
		int []c = new int[10];//Combining Both Statement
		
		for(int element : b) {
			System.out.println(element);
		}
		
		for(int i=0;i<10;i++) {
			Scanner in = new Scanner(System.in);
			System.out.println("Enter The Number : ");
			c[i]=in.nextInt();
		}
		
		for(int element : c) {
			System.out.println(element);
		}
	}

}
