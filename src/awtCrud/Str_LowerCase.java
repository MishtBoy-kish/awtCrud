package awtCrud;

public class Str_LowerCase {

	public static void main(String[] args) {
		StringBuilder a = new StringBuilder("ABCD");
		System.out.println("Original String : "+a);
		
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)>=65 && a.charAt(i)<=90) {
				int c = (int)a.charAt(i)+32;
				a.setCharAt(i, (char)c);
			}
		}
		System.out.println("Lower Case : "+a );
	}

}
