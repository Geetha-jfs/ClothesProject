package exceptionhandling;

public class exceptionhandling {
	public static void main(String []args)
	{
		int i=100;
		int result=0;
		try {
		result=i/0;
		}
		catch(Exception e)
		{
			System.out.println("Cannot divide by zero");
		}
		System.out.println(result);
	}

}
