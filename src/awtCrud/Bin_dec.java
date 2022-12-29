package awtCrud;

public class Bin_dec {
	public static int bin2dec(int binary) {
		int decimal=0;
		int power=0;
		while(binary!=0)//1100 110 11 1
			{
			int reminder = binary%10;//0 0 1 1
			decimal += reminder * Math.pow(2, power);//4+8=12
			binary = binary/10;//110 11 1
			power++;//1 2 3
		}
		return decimal;
	}

	public static void main(String[] args) {
		System.out.println("Decimal Number Is "+bin2dec(1100));

	}

}
