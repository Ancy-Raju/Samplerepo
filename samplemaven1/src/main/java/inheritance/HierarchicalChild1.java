package inheritance;

public class HierarchicalChild1  extends HierarchicalParent{
public void show()
{
	System.out.println("First Child");
}
	public static void main(String[] args) {
		HierarchicalChild1 obj = new HierarchicalChild1();
		obj.show();
		obj.display();
		// TODO Auto-generated method stub

	}

}
