package inheritance;

public class HierarchicalChild2 extends HierarchicalParent {
	public void print()
	{
		System.out.println("This is the Second child");
	}
	public static void main(String args[])
	{
		HierarchicalChild2 obj = new HierarchicalChild2();
		obj.print();
		obj.display();
	}
}
