import java.util.Scanner;

public class SplitWordsUsingSubString
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the input string: ");
		String input = sc.nextLine();

		System.out.println("Enter the substring you want to eliminate: ");
		String substring = sc.nextLine();
		
	
	
		//String output = "";

		int startingIndex = input.indexOf(substring); //we get the Index of Substring from the Input
		
		
		if (startingIndex == -1)
		{
		    System.out.println("The substring is not present in the input string.");
		}
		
		else 
		{
		    String output = input.substring(0, startingIndex) + input.substring(startingIndex + substring.length());
		    System.out.println("Output string : " + output);
		}
		/*
		 * for (int i = startingIndex + substring.length(); i < input.length(); i++)
		 * 
		 * { if (i < startingIndex || i >= startingIndex + substring.length()) output +=
		 * input.charAt(i); } System.out.println(output);
		 */
	}

}
