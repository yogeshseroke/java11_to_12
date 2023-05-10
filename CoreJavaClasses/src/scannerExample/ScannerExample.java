package scannerExample;
import java.util.Scanner;
public class ScannerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter integer...");
		int a = sc.nextInt();
		System.out.println(a);
		
		System.out.println("enter String...");
		String s = sc.next();
		System.out.println(s);
		
		System.out.println("enter character...");
		char c = sc.next().charAt(0);
		System.out.println(c);
		
		System.out.println("enter float...");
		float f = sc.nextFloat();
		System.out.println(f);
		
		System.out.println("enter double...");
		double d = sc.nextDouble();
		System.out.println(d);
		
		System.out.println("enter boolean...");
		boolean b = sc.nextBoolean();
		System.out.println(b);
		
		System.out.println("enter short...");
		short s1 = sc.nextShort();
		System.out.println(s1);
		
		System.out.println("enter long...");
		long l = sc.nextLong();
		System.out.println(l);
		
		//9,223,372,036,854,775,807
		//9,898,978,595,483,932,928
		
		
	}

}
