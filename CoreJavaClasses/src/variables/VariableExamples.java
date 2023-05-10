package variables;

public class VariableExamples {

	int a;
	
	void fun() {
		int b=20;
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VariableExamples obj = new VariableExamples();
		obj.a=12;
		System.out.println(obj.a);
		obj.fun();
	}

}
