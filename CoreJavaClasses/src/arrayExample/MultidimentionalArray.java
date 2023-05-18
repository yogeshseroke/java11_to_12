package arrayExample;

import java.util.Scanner;

public class MultidimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int ar[] = {1,9,2,7};
		//result = 1,9,2,7
		//ar[0]=1;
		
		
		//multidimentional array...
		
		//int ar[][] = {{1,2},{3,4}};
		
//		int ar[][] = {{1,2}, {3,4}};
//		System.out.println(ar[1][1]);
		
//		for(int i=0; i<=ar.length-1; i++) {
//			for(int j=0; j<=ar.length-1; j++) {
//				System.out.print(ar[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		
		//user input in multidimentional array...
		
//		int ar[][] = new int[2][2];
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter value for array");		
//		for(int i=0; i<=ar.length-1; i++) {
//			for(int j=0; j<=ar.length-1; j++) {
//				System.out.println("enter value for "+i+" "+j);
//				ar[i][j] = sc.nextInt();
//			}
//		}
//		System.out.println("given array is..");
//		for(int i=0; i<=ar.length-1; i++) {
//			for(int j=0; j<=ar.length-1; j++) {
//				System.out.print(ar[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		//increasing, decreasing, smallest, largest, secMax....
		
//		int ar[][] = {{12,21,32},{41,52,16},{23,56,11}};
//		for(int i=0; i<=ar.length-1; i++) {
//			for(int j=0; j<=ar.length-1; j++) {
//				System.out.print(ar[i][j]+" ");
//			}
//			System.out.println();
//		}
//		int temp;
//		for(int i=0; i<=ar.length-1; i++) {
//			for(int j=i; j<=ar[i].length-1; j++) {
//				if(ar[i][j]>ar[i][j]) {
//					temp = ar[i][j];
//					ar[i][j] = ar[i][j];
//					ar[i][j] = temp;
//				}
//			}
//
//		}
//		System.out.println("==========================");
//		for(int i=0; i<=ar.length-1; i++) {
//			for(int j=0; j<=ar.length-1; j++) {
//				System.out.print(ar[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		
		//max
		
//		int ar[][] = {{12,21,32},{41,52,16},{23,56,11}};
//		
//		for(int i=0; i<=ar.length-1; i++) {
//			for(int j=0; j<=ar.length-1; j++) {
//				System.out.print(ar[i][j]+" ");
//			}
//			System.out.println();
//		}
//		
//		int max = 0;
//		for(int i=0; i<=ar.length-1; i++) {
//			for(int j=0; j<=ar.length-1; j++) {
//				if(ar[i][j]>max) {
//					max = ar[i][j];
//				}
//			}
//		}System.out.println(max);
		
		//secMax
//		int ar[][] = {{12,21,32},{41,56,16},{23,56,11}};		
//		for(int i=0; i<=ar.length-1; i++) {
//			for(int j=0; j<=ar.length-1; j++) {
//				System.out.print(ar[i][j]+" ");
//			}
//			System.out.println();
//		}
//		
//		int max = 0;
//		int secMax = 0;
//		for(int i=0; i<=ar.length-1; i++) {
//			for(int j=0; j<=ar.length-1; j++) {
//				if(ar[i][j]>max) {
//					secMax = max;
//					max = ar[i][j];
//				}else if(ar[i][j]>secMax && ar[i][j]<max) {
//					secMax = ar[i][j];
//				}
//			}
//		}System.out.println("max = "+max+" secMax = "+secMax);
		
		//minmum...
		
		int ar[][] = {{12,21,32},{41,56,16},{23,56,11}};		
		for(int i=0; i<=ar.length-1; i++) {
			for(int j=0; j<=ar.length-1; j++) {
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
		
		int min = ar[0][0];
		
		for(int i=0; i<=ar.length-1; i++) {
			for(int j=0; j<=ar.length-1; j++) {
				if(ar[i][j]<min) {
					min = ar[i][j];
				}
			}
		}System.out.println("min = "+min);
		
	}

}
