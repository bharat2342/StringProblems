package InterviewQuestions;

import java.util.Scanner;

public class RepeatChars1 
{

	public static void main(String[] args) 
	{
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a string: ");
		        String inputString = scanner.nextLine();

		        StringBuilder sb = new StringBuilder();
		        for (int i = 0; i < inputString.length(); i++)
		        {
		            for (int j = 0; j < i + 1; j++) 
		            {
		                sb.append(inputString.charAt(i));
		            }
		        }
		        System.out.println(sb.toString());
		    }
		


}

