package awtCrud;

public class StringBuffer_StringBuilder {
//String Buffer And String Builder  There are Almost Same difference is Mutable And Non-Mutable
//Just Change the Class like (	String Buffer To String Builder )
	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer("Kishore");
		System.out.println(buffer);
		
		buffer.append(" Kumar");
		System.out.println(buffer);
		
		buffer.insert(13," Composer");
		System.out.println(buffer);
		
		buffer.replace(8, 13, "***");
		System.out.println(buffer);
		
		buffer.delete(8, 12);
		System.out.println(buffer);
		
		buffer.reverse();
		System.out.println(buffer);
		
		System.out.println(buffer.charAt(2));
		System.out.println(buffer.length());
		
		System.out.println(buffer.substring(0));
		System.out.println(buffer.substring(0,5));
		
		buffer.setCharAt(0, '*');
		System.out.println(buffer);
	
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		
		sb.append("Hello");
		System.out.println(sb.capacity());
		
		sb.append("Java Is My Favourite Language");
		System.out.println(sb.capacity());
	}

}

