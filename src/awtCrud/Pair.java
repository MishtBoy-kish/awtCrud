package awtCrud;

import java.util.Arrays;

public class Pair {
	public static void main(String[] args) {
//		int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};
//for(int i=0;i<ar.length;i++) {
//	System.out.println(i);
//}
		
		int res = 0;
		int[]num = {10, 20, 20, 10, 10, 30, 50, 10, 20,};
	     Arrays.sort(num);
       
        for(int i=0;i<num.length-2;i++){
        	 int counter = 1;
            for(int j=i+1;j<num.length-1;j++){
                if(num[i] == num[j])
                {
                    counter = counter + 1;
                    //num[j]= 0;
                }
                
            }
            
            res = res + counter /2;
//            if(counter==1) 
//            {
//                 System.out.println("pair found for: "+num[i]);
//            counter = 0;
//            }
            
        }
        
        System.out.println(res);
        
	}
}
