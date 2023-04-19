import java.util.Scanner;

public class SplitWordsUsingLoops
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input string: ");
		String input = sc.nextLine();
		System.out.println("Enter the substring you want to eliminate: ");
		String substring = sc.nextLine();

		String output = "";
		int substringIndex = 0;
		for (int i = 0; i < input.length(); i++) 
		{
		    if (substringIndex < substring.length() && input.charAt(i) == substring.charAt(substringIndex)) 
		    {
		        substringIndex++;
		    }
		    else
		    {
		        output += input.charAt(i);
		        substringIndex = 0;
		    }
		}
		System.out.println("Output string : " + output);

	}

}
