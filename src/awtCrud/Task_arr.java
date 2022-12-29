package awtCrud;

import java.util.Arrays;

public class Task_arr {

	public static void main(String[] args) {
	
		int [] a = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Before Operation : "+Arrays.toString(a));
		
		
		for(int i=0;i<a.length;i++) {
			
		//a[i]=a[i-1];
			if(i%2==0)
			{
		System.out.println("After Operation : "+a[i]);
			}
	}
			
		
		}
	}

