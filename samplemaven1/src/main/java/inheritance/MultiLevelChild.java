package inheritance;

public class MultiLevelChild extends MultiLevelParent {
	public void show()
	{
		System.out.println("This is a child");
	}

	public static void main(String[] args) {
		MultiLevelChild obj = new MultiLevelChild();
		obj.display();
		obj.show();
		obj.print();
		
		// TODO Auto-generated method stub

	}

}
