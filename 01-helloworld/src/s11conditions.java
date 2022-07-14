
public class s11conditions {

	public static void main(String[] args) {
	boolean isAllen = false;
	if(isAllen) {
		System.out.println("It is not an allen");
		
	}
	if(!isAllen) {
		System.out.println("It is not allen");
		
	}
	String name = "sanjeet";
	if(name== "sanjeet") {
		System.out.println("true");
	}
	boolean x = true;
	boolean y = false;
	if(x&&y) {
		System.out.println("Both the conditions are true");
	}
	else if(x) {
		System.out.println("only x is true");
	}
	else {
		System.out.println("only y is true");
	}
	int a = 20;
	int b = 30;
	int c = 60;
	System.out.println("a < b" + (a+b));
	System.out.println("a < b and a < c = " + (a<b && a < c));
	System.out.println(" A after logical and =" +a);
	System.out.println("a < b and a < c=" + (a< b & ++a<c));
	
	}

}


