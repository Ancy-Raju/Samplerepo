package superkeyword;

public class SuperMethodChild extends SuperMethodParent {
	public void show()
	{
		System.out.println("Child Menthod");
		super.display();
	}

	public static void main(String[] args) {
		SuperMethodChild obj = new SuperMethodChild();
		obj.show();
		// TODO Auto-generated method stub

	}

}
