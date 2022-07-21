
public class StringMethods {

	public static void main(String[] args) {
		String s = "Hello World";
		System.out.println(s.length());
		
		System.out.println("Index of W = " + s.indexOf('W'));
		
		// print the character at position
		System.out.println("Character at 3 = " + s.charAt(3));
		System.out.println("Character at 10 = " + s.charAt(10));
		System.out.println("command after exception");
		System.out.println("Index of l = " + s.indexOf('1'));
		System.out.println("Index of second 2 =" + s.indexOf('1',3));
		System.out.println("substring:" + s.substring(3));
		String[]s3 = s.split("o");
		
		System.out.println(s3[0]);
		System.out.println(s3[1]);
		System.out.println(s3[2]);
		System.out.println("index of space:" + s.indexOf(" " ));
		System.out.println("Replaced:" + s.replace("1", "j"));
		System.out.println("Uppercase:" + s.toUpperCase());
		System.out.println("Lowercase:" + s.toLowerCase());
		
		

	}

}
