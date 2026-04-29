package inheritance;

import interfaceexample.Interface1;

public class Interfacechild implements  Interface1, Interface2 {
	public void show()
	{
		System.out.println("helo");
	}

	public static void main(String[] args) {
		Interfacechild obj2 = new Interfacechild();
		obj2.display();
		obj2.show();
		obj2.print();
		
		// TODO Auto-generated method stub

	}

	@Override
	public void display() {
		System.out.println("password");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print() {
		{
			System.out.println(1234);
		}
		// TODO Auto-generated method stub
		
	}

}
