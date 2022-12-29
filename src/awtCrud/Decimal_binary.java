package awtCrud;

import java.util.Scanner;

public class Decimal_binary {
public static int Decimal2binary (int n){ 
	int[] binaryNum = new int[1000];
	int i = 0;
	while(n>0) {
		binaryNum[i]=n%2;
		n=n/2;
		i++;
	}
	for(int j=i-1;j>=0;j--) 
		System.out.print(binaryNum[j]);
	
return i;
}
	public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter The Decimal Number : ");
    int n = in.nextInt();
    System.out.println("Decimal Number Is "+n);
    System.out.print("Binary Number Is ");
    Decimal2binary(n);
	}

}
