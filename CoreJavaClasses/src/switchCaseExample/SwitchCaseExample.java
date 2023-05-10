package switchCaseExample;
import java.util.Scanner;
public class SwitchCaseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		switch() {
//		case:1
//		statement:
//			break;
		
//		default:
//			statement:
//				break;
//		}
		System.out.println("choose your option...");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		
		switch(ch) {
		case 'i':
			System.out.println("instagram");
//			break;
			
		case 'f':
			System.out.println("facebook");
//			break;
			
		case 'w':
			System.out.println("whats App");
//			break;
			
		case 't':
			System.out.println("twitter");
//			break;	
			
		default :
			System.out.println("please give suitable input...");
		}
		
//		switch(ch) {
//		case 'a':
//		case 'A':
//		case 'e':
//		case 'E':
//		case 'i':
//		case 'I':
//		case 'o':
//		case 'O':
//		case 'u':
//		case 'U':
//			System.out.println("Vowel");
//			break;	
//			
//		default :
//			System.out.println("Consonant...");
//		}
		
//		int num = sc.nextInt();
//		
//		switch(num%2) {
//		case 0:
//			System.out.println("even");
//			break;
//			
//		default:
//			System.out.println("odd");
//			break;
//		}
	}

}
