package conditionalStatement;

public class IfElseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//simple if
		
//		int a = 20;
//		if(a==10) {
//			System.out.println("a=10");
//		}
		
		//if-else
		
//		if(a==20) {
//			System.out.println("a=20");
//		}else {
//			System.out.println("a=10");
//		}
		
		//nested if-else
//		int a=3,b=20,c=100;
//		if(a>b) {
//			if(a>c) {
//				System.out.println("a is greater");
//			}else {
//				System.out.println("c is greater");
//			}
//		}else {
//			if(b>c) {
//				System.out.println("b is greater");
//			}else {
//				System.out.println("c is greater");
//			}
//		}
		
		//Multiple if
		//int a=10,b=20,c=300,d=40;
//		if(c>b) {
//			System.out.println("c is greater than b");
//		}
//		if(c>a) {
//			System.out.println("c is greater than a");
//		}
//		if(c>d) {
//			System.out.println("c is greater than d");
//		}
//		if(c>b)
//			System.out.println("c");
//		if(c>a)
//			System.out.println("c");
//		if(c>d)
//			System.out.println("c");
		
		//Ladder if-else or else-if
		int a=10,b=2,c=3,d=4,e=5;
		
		if(a<b) {
			System.out.println("a<b");
		}else if(a<c) {
			System.out.println("a<c");
		}else if(a<d) {
			System.out.println("a<d");
		}else if(a<e) {
			System.out.println("a<e");
		}else {
			System.out.println("nothing");
		}
	}

}
