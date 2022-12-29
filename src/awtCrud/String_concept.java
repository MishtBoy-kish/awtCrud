package awtCrud;

public class String_concept {

	public static void main(String[] args) {
		String a = "Kishore Kumar";
		String b = "kishore kumar";
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Hashcode Of A is : "+a.hashCode());
		System.out.println("Hashcode Of B is : "+b.hashCode());

		System.out.println("Equals : "+a.equals(b));
		System.out.println("Equals Of IgnoreCase : "+a.equalsIgnoreCase(b));

		System.out.println("Length : "+a.length());
		System.out.println("CharAt : "+a.charAt(0));
		
		System.out.println("UpperCase : "+a.toUpperCase());
		System.out.println("LowerCase : "+a.toLowerCase());
		
		System.out.println("Replace : "+a.replace("Kishore","kish"));
		System.out.println("Contains : "+a.contains("Kumar"));
		
		System.out.println("Empty : "+a.isEmpty());
		System.out.println("StartWith : "+a.startsWith("Kis"));
		
		System.out.println("EndWith : "+ a.endsWith("mar"));
		System.out.println("SubString : "+ a.substring(5));
		
		System.out.println("SubString : "+a.substring(0,5));
		char[]carray = a.toCharArray();
		for(char c : carray) {
			System.out.print(c+"    ");
		}
		
		String c = "  Kisan  ";
		System.out.println("C :"+c.length());
		System.out.println("C Trim :"+c.trim());
		System.out.println("C Trim Length :"+c.trim().length());
		
	}

}
