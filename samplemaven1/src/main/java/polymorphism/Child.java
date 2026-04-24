package polymorphism;

public class Child extends Parent {
	public void display()
	{
		System.out.println("child class");
		super.display();
	}

	public static void main(String[] args) {
		Child obj = new Child();
		obj.display();
		// TODO Auto-generated method stub

	}

}
