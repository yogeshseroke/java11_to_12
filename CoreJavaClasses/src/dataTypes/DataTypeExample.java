package dataTypes;

public class DataTypeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//premitive data types...
		
		int a=10;
		float b=20.30f;
		char c='a';
		boolean d=true;//flase
		double e=4857.4837298;
		
		System.out.println("int "+a);
		a=1000;
		System.out.println("int "+a);
		System.out.println("float "+b);
		System.out.println("char "+c);
		System.out.println("boolean "+d);
		System.out.println("double "+e);
		
		//Non-premitive data types...
		
		String s="ABCD";
		Object o=68.4f;
		
		System.out.println("String "+ s);
		System.out.println("Object "+o);
		
		o="this is object type variable";
		System.out.println("Object "+o);
		
		//Wrapper classes...
		
		Integer i = 29;
		Character j = 'x';
		System.out.println("wrapper class "+i);
		System.out.println("wrapper class "+j);
	}

}
