package arrayExample;

import java.util.Scanner;

public class ArrayExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int ar[] = {49,58,74,39};
//		
//		for(int i=0; i<=ar.length-1; i++) {
//			System.out.print(ar[i]+" ");
//		}
		
//		String sr[] = {"ashish", "krishna", "shiva", "mangalum"};
//		
//		for(int i=0; i<sr.length; i++) {
//			System.out.println(sr[i]);
//		}
		
		//for-each loop...
		
//		int ar[] = {5,93,86,17,12,54,63};
//		
//		for(int i : ar) {
//			System.out.print(i+" ");
//		}//swipelinc => lincpay
		
//		String sr[] = {"abc", "xyz", "jkl", "mno"};
//		for(String s : sr) {
//			System.out.println(s);
//		}
		
//		int ar[] = {6,9,5,8,3};
//		String sr[] = {"abc", "xyz", "jkl", "lnm"};
//		
//		Object ar1[] = {5, 'c', "abc", 3.5f, 34.56};
//		
//		for(int i=0; i<=ar1.length-1; i++) {
//			System.out.print(ar1[i]+" ");
//		}
//		
//		for(Object o : ar1) {
//			System.out.print(o+" ");
//		}
		
//		int ar[] = new int[5];
//		
//		ar[0] = 1;
//		ar[1] = 2;
//		
//		ar[3] = 4;
//		ar[4] = 5;
//		
//		for(int i : ar) {
//			System.out.print(i+" ");
//		}
		
//		String sr[] = new String[4];
//		
//		sr[0] = " ";
//		sr[1] = "XYZ";
//		//sr[2] = "JKL";
//		sr[3] = "PQR";
//		
//		for(String s : sr) {
//			System.out.println(s);
//		}
		
//		int[] ar = {3,9,2,8,5};
//		for(int i : ar) {
//			System.out.print(i+" ");
//		}
		
		
		
		// Question:1 => arrange given array in increasing order..
//		int[] ar = {3,9,2,8,5};
//		
//		for(int i : ar) {
//			System.out.print(i+" ");
//		}
//		
//		System.out.println();
//		
//		int temp;
//		for(int i=0; i<=ar.length-1; i++) {
//			for(int j=i+1; j<=ar.length-1; j++) {
//				if(ar[i]>ar[j]) {
//					temp = ar[i];
//					ar[i] = ar[j];
//					ar[j] = temp;
//				}
//			}
//			
//			System.out.print(ar[i]+" ");
//		}
		
//		int temp;
//		int ar[] = {39,4,8,57};
//		for(int i=0; i<=ar.length-1; i++) {
//			for(int j=i+1; j<=ar.length-1; j++) {
//				if(ar[i]<ar[j]) {
//					temp = ar[i];
//					ar[i] = ar[j];
//					ar[j] = temp;
//				}
//			}
//			System.out.print(ar[i]+" ");
//		}
		
	//greatest number from array....
		
//		int ar[] = {149,3,82,172,83};
		
//		int max=0;
//		
//		for(int i=0; i<=ar.length-1; i++) {
//			if(ar[i]>max) {//149>0, 3>49, 82>49, 72>82, 83>82
//				max = ar[i]; //max=49->82->83
//			}
//		}
//		System.out.println(max);
		
		//smallest number from array....
//		int ar[] = {149,3,82,172,83};
//		
//		int min = ar[0];//149
//		
//		for(int i=0;i<=ar.length-1; i++) {
//			if(ar[i]<min) {//149<149, 3<149, 82<3, 3>172, 3>83
//				min=ar[i];//min=3
//			}
//		}System.out.println(min);
		
		//max and min from an array....
//		int ar[] = {12,9,3,8,4,7,15};
//		int max=0;
//		int min=ar[0];
//		for(int i=0; i<=ar.length-1; i++) {
//			if(ar[i]>max) {
//				max=ar[i];
//			}else if(ar[i]<min){
//				min=ar[i];
//			}
//		}System.out.println("max = "+ max);
//		System.out.println("min = "+ min);

	//second maximum number from non-repeating array...
//		int ar[] = {12,9,3,8,4,7,15};
//		int max = 0;
//		int secMax = 0;
//		
//		for(int i=0; i<=ar.length-1; i++) {
//			if(ar[i]>max) {//12>0, 9>12, 3>12, 8>12, 4>12,7>12, 15>12
//				secMax=max;//secMax=0, secMax=12
//				max=ar[i];//max=12, max=15
//			}else if(ar[i]>secMax) {//9>0, 3>9, 8>9, 4>9, 7>9
//				secMax=ar[i];//secMax=9
//			}
//		}
//		System.out.println("max = "+max);
//		System.out.println("secMax = "+secMax);
		
		
		//find second max from repeating array...
//		int ar[] = {12,9,3,15,8,4,7,15};
//		int temp;
//		int secMax=0;
//		for(int i=0; i<=ar.length-1; i++) {
//			for(int j=i+1; j<=ar.length-1; j++) {
//				if(ar[i]>ar[j]) {
//					temp=ar[i];
//					ar[i]=ar[j];
//					ar[j]=temp;
//				}
//				if(ar[i]!=ar[j]) {
//					secMax = ar[i];
//				}
//			}
//			System.out.print(ar[i]+" ");
//		}
//		System.out.println("second max = "+secMax);
		
//		int ar[] = {12,9,3,15,8,4,7,15};
//		int max=0,secMax=0;
//		for(int i=0; i<=ar.length-1; i++) {
//			if(ar[i]>max) {
//				secMax=max;
//				max=ar[i];
//			}else if(ar[i]>secMax && ar[i]<max) {
//				secMax = ar[i];
//			}
//			}
//		System.out.println(secMax);
		
		
		//user input...
		
		Scanner sc = new Scanner(System.in);
		
		int ar[] = new int[5];
		System.out.println("please enter value for integer array...");
		for(int i=0; i<=ar.length-1; i++) {
			ar[i]=sc.nextInt();
		}
		System.out.println("given array is....");
		for(int i=0; i<=ar.length-1; i++) {
			System.out.print(ar[i]+" ");
		}

		
		
		}
	}


