
public class Strings {

	public static void main(String[] args) {
		String s2 = new String("something");
		
		
		// char array
		char[] c = {'s','n','l','e'};
		String s3 = new String(c);
		
		byte[]b = {65,66,67};
		String s4 = new String(b);
		
		
		// string literal
		String name = "Sanjeet";
		System.out.println("Name:" + name);
		System.out.println("Length of Name:" + name.length());
		System.out.println(s3);
		
       System.out.println(s4);
	}

}
