package InterviewQuestions;

import java.util.Scanner;

public class ToAddNumbers 
{

	    public static void main(String[] args) 
	    {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();
	        int numStr = sumNumbersInString(input);
	        System.out.println("The numbers in the input string are: " + numStr);
	    }

	    public static int sumNumbersInString(String str) 
	    {
	        int sum = 0;
	        String numStr = "";
	        for (int i = 0; i < str.length(); i++) 
	        {
	            char c = str.charAt(i);
	            if (Character.isDigit(c)) 
	            {
	                numStr += c;
	            } 
	            else
	            {
	                if (!numStr.isEmpty())
	                {
	                    sum += Integer.parseInt(numStr);
	                    numStr = "";
	                }
	            }
	        }
	        if (!numStr.isEmpty()) 
	        {
	            sum += Integer.parseInt(numStr);
	        }
	        return sum;
	    }

	    }
	


