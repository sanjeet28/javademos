
public class s13ternary {

	public static void main(String[] args) {
		//
		int age = 20;
		boolean canDrive  = false;
		if(age > 18) {
			canDrive = true;
		}
		else {
			canDrive = false;
		}
        canDrive = (age > 18) ? true : false;
        System.out.println("Can Drive ? " + canDrive);
	}
//


int age = 19;
boolean hasLicense = true;
boolean canDrive1  =  (age> 18 ) ? true: false;
boolean canRentCar = canDrive1 ? (hasLicense ? true: false):false;

System.out.println("Age =  " + age);
System.out.println("canDrive1 ?" + canDrive1);
System.out.println("can Rent a car ?" + canRentCar );
System.out.println("");
String result = canDrive1 ? (hasLicense ? "Has License Can drive": "No license can't drive"): "Cannot drive";
	}
}

