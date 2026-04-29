package interfaceexample;

public class Interface2 implements Interface1{
	public void show()
	{
		System.out.println("Hello");
	}
public static void main(String[] args) {
		Interface2 obj = new Interface2();
		obj.display();
		obj.print();
		obj.show();
		//reference creation
		Interface1 obj1 = new Interface2();
		obj1.display();
		obj1.print();
		
		// TODO Auto-generated method stub

	}

	@Override
	public void display() {
		System.out.println("My name Ancy");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print() {
		System.out.println("Password 101");
		// TODO Auto-generated method stub
		
	}

}
