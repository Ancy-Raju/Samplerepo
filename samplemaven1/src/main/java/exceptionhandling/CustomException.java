package exceptionhandling;

public class CustomException {

	public static void main(String[] args) throws VotingException {
		int age =9;
		if(age>=18)
		{
			System.out.println("eligible to vote");
		}
		else
		{
			throw new VotingException("age under 18");
		}
		// TODO Auto-generated 
		// TODO Auto-generated method stub

		
	}

}
