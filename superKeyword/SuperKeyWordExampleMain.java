package superKeyword;

public class SuperKeyWordExampleMain extends SuperKeyWordExample{

	
	void display2() {
//		super.display1();
//		this.display1();
		
//		this.display1();
//		super.display1();
		
		
		//method ke under constructor call ni hoga...
//		this.SuperKeyWordExample();
//		super.SuperKeyWordExample();

	// method ke under constructor call nhi hoga	
//	super();
	
	}

	
	SuperKeyWordExampleMain() {
		
		//super ke uper koi bhi statement ya this nhi aayega...
//		this.SuperKeyWordExample();

		super();
		this.display1();
		//agar humne extends keyword hataya to child constructor khud ko call karega...
		System.out.println("child constructor");		
		
	}
	
	
	public static void main(String[] args) {
		
		SuperKeyWordExampleMain obj = new SuperKeyWordExampleMain();
		obj.display2();

	}

}
