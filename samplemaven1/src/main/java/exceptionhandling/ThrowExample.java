package exceptionhandling;

public class ThrowExample {

	public static void main(String[] args) {
		int age =19;
		if(age<=18)
		{
			System.out.println("eligible to vote");
		}
		else
		{
			throw new ArithmeticException("age under 18");
		}
		// TODO Auto-generated method stub

	}

}
