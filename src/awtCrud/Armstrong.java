package awtCrud;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		int digit_1;
		int digit_2;
		int digit_3;
		int result;
		int temp;
		
		for(int number=100;number<=999;number++) {
		
	    temp = number;
	    
		digit_3 = temp%10;
		temp = temp/10;
		
		digit_2 = temp%10;
	    temp = temp/10;
		
		digit_1 = temp%10;
		
	    result = (digit_1*digit_1*digit_1)+(digit_2*digit_2*digit_2)+(digit_3*digit_3*digit_3);
		if(number==result) {
			System.out.println("It is Armstrong Number "+ result);
		}
		
	}

}
}