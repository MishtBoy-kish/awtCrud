package awtCrud;

public class CountCharacter {

	public static void main(String[] args) {
	StringBuilder a = new StringBuilder("Ram-age is 12@");
	System.out.println(a);
	int Upper=0;
	int Lower=0;
	int Space=0;
	int Number=0;
	int Vowels=0;
	
	for(int i=0;i<a.length();i++) {
		if(a.charAt(i)>=97 && a.charAt(i)<=122) {
			Lower++;
		}
		if(a.charAt(i)>=65 && a.charAt(i)<=90) {
			Upper++;
		}
		if(a.charAt(i)==32) {
			Space++;
		}
		if(a.charAt(i)>=48 && a.charAt(i)<=57) {
			Number++;
		}
		
		if(a.charAt(i)=='A' ||a.charAt(i)=='E' ||a.charAt(i)=='I' ||a.charAt(i)=='O' ||a.charAt(i)=='U' ||
				a.charAt(i)=='a' ||a.charAt(i)=='e' ||a.charAt(i)=='i' ||a.charAt(i)=='o' ||a.charAt(i)=='u') {
		Vowels++;
		}
	}
	System.out.println("Upper    : "+Upper);
	System.out.println("Lower    : "+Lower);
	System.out.println("Space    : "+Space);
	System.out.println("Numbers  : "+Number);
	System.out.println("Vowels   : "+Vowels);
	System.out.println("Special  : "+(a.length()-(Upper+Lower+Space+Number)));

	}

}
