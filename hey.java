package hey;

public class hey {

	public static void main(String[] args) {
		
		int variableName= 5; //this is our 
		char character = 'c'; //a character variable goes in single quotes
		String hello = "Hello, world! "; //a string variable goes in double quotes
		
		int x = 6; //be careful of integer division
		int y = 10; //use "(double)" to typecast and get the correct answer
		
		//System.out.println(x<y && x!=y); //use "==" to check equality, and "!=" to check inequality
		//short-circuiting can be useful
		
		//determine the factorial of a number, n
		int n = 15;
		int answer = 1;
		for(int i=1; i<=n; i=i+1)
		{
			answer = i*answer;
		}
		
		System.out.println(answer);
		
		int m = 5;
		if(m == 0)
		{
			//do stuff
			System.out.println("Undefined);
		}
		else
		{
			//do stuff
			System.out.println((double)1/m);
		}
		//while(true) // a top tested (infinite) loo[
		//{
		//  System.out.println(x);
		//	x = x+1;
		//}
		
		//do //a bottom tested (infinite) loop
		//{
		//	System.out.println(x);
		//	x = x+1;
		//} while(false);
	  
	}

}
