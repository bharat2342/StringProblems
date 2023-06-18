package InterviewQuestions;

public class DigitSum 
{

	public static void main(String[] args) 
	{
		//with pre-defined method
		/*
		 * String x = "000001"; int sum = 0; for (int i = 0; i < x.length(); i++)
		 * 
		 * { char digitChar = x.charAt(i); 
		 *   int digit =Character.getNumericValue(digitChar); 
		 *   sum += digit;
		 *  }
		 * System.out.println("Output: " + sum);
		 */
		
	      //Without the Method
		
		    String x = "302";
	        int sum = 0;
	        for (int i = 0; i < x.length(); i++)
	        
	        {
	            char digitChar = x.charAt(i);
	            int digit = digitChar - '0';
	            sum += digit;
	        }
	        System.out.println("Output: " + sum);
		
		

	}

}
