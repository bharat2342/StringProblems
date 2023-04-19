package InterviewQuestions;

import java.util.Scanner;

public class RepeatCharswithSeqWithoutCommonchar
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        char[] inputArray = inputString.toCharArray();
        //The output char total if demo is 4 letters and output characters=10
        
        char[] outputArray = new char[(inputArray.length * (inputArray.length + 1)) / 2];

        int index = 0;
        for (int i = 0; i < inputArray.length; i++) 
        {
            for (int j = 0; j <= i; j++) 
            {
                outputArray[index] = inputArray[i];
                index++;
            }
        }

        String outputString = new String(outputArray);
        System.out.println(outputString);

	}

}
