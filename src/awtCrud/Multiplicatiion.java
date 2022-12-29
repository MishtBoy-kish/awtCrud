package awtCrud;

import java.util.Scanner;

public class Multiplicatiion {

	public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	System.out.println("Enter The Table: ");
	int t=in.nextInt();
	System.out.println("Enter The Limit: ");
	int n =in.nextInt();
	
	for(int i=1;i<=n;i++) {
	System.out.println(t+"*"+i+"="+(t*i));
	}
	}
}
