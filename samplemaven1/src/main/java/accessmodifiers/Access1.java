package accessmodifiers;

public class Access1 {
	public void display1()
	{
		System.out.println("Public");
	}
	public void display2()
	{
		System.out.println("Private");
	}
	public void display3()
	{
		System.out.println("Protected");
	}
	public void display4()
	{
		System.out.println("default");
	}

	public static void main(String[] args) {
		Access1 obj = new Access1();
		obj.display1();
		obj.display2();
		obj.display3();
		obj.display4();
		// TODO Auto-generated method stub

	}

}
