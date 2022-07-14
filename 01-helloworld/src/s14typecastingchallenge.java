
public class s14typecastingchallenge {

	public static void main(String[] args) {
		
		String input = "12";
		String input1 = "12.45666";
		Double dew = Double.parseDouble(input1);
		int mysyt  =  Integer.parseInt(input);
		System.out.println("Integer val =" + mysyt);
	     System.out.println(dew);
		char str = (char)Integer.parseInt(input);
		System.out.println(str);
		

	}

}
