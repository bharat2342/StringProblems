package InterviewQuestions;

import java.util.Scanner;

public class ToADDinAString 
{


		public static int sumNumbersInString(String str) {
		    int sum = 0;
		    String numStr = "";
		    for (int i = 0; i < str.length(); i++) {
		        char c = str.charAt(i);
		        if (Character.isDigit(c)) {
		            numStr += c;
		        } else {
		            if (!numStr.isEmpty()) {
		                sum += Integer.parseInt(numStr);
		                numStr = "";
		            }
		        }
		    }
		    if (!numStr.isEmpty()) {
		        sum += Integer.parseInt(numStr);
		    }
		    return sum;
		}

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        int output = sumNumbersInString(input);
        System.out.println(output); // prints the sum of the numbers in the string
    }

}
