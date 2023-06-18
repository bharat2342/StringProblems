package InterviewQuestions;

import java.util.Scanner;

public class DigitSum1
{

	public static void main(String[] args) 
	{
		 
		/*
		 * String x = "3021";
		 * int sum = calculateDigitSum(x);
		 * System.out.println("Output: " + sum);
		 */
		        
		        
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a string of digits: ");
		        String x = scanner.nextLine();
		        scanner.close();

		        int sum = calculateDigitSum(x);
		        System.out.println("Output: " + sum);
		        
	}

		    public static int calculateDigitSum(String str) 
		    {
		        int sum = 0;
		        for (int i = 0; i < str.length(); i++) 
		        {
		            char digitChar = str.charAt(i);
		            int digit = Character.getNumericValue(digitChar);
		            sum += digit;
		        }
		        return sum;
		    }
		

	}


