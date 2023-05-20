package oopsConceptExample;

public class ConstructorExample {

	//constructor... => object making, 
	//				 => every java class have default constructor.
	//               => constructor name ans class name must be same..
	
	//Type of constructor :- (1) default (2) parameterized (3) copy constructor
	
	//(1) default constructor...
	
	ConstructorExample(){
		System.out.println("This is default constructor...");
	}
	
	//(2) parameterized constructor...
	
	ConstructorExample(String fname){
		System.out.println(fname);
	}
	
	String s1;
	String s2;
	//(3) copy constructor...
	
	ConstructorExample(ConstructorExample fname, ConstructorExample lname){

		this.s1=fname.s1;
		this.s2=lname.s2;
		System.out.println(fname.s1 + lname.s2);


	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorExample obj = new ConstructorExample();
		ConstructorExample obj1 = new ConstructorExample("ABC");
		ConstructorExample obj2 = new ConstructorExample(obj1, obj1);
		

	}

}
