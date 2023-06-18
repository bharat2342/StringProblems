package InterviewQuestions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ToSeparateVowelsandConsonantsusingRegex 
{

	public static void main(String[] args) 
	{
		//Input from the user
		/*
		 * Scanner scanner = new Scanner(System.in);
		 * System.out.print("Enter a sentence: "); String inputString =
		 * scanner.nextLine(); scanner.close();
		 */
		String inputString = "Chinnu is an automation test engineer";

        String vowels = getMatchingChars(inputString, "[aeiouAEIOU]");
        String consonants = getMatchingChars(inputString, "[^aeiouAEIOU\\s]");

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    private static String getMatchingChars(String inputString, String regex) 
    {
        StringBuilder result = new StringBuilder();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(inputString);

        while (matcher.find()) 
        {
            result.append(matcher.group());
        }

        return result.toString();
		
	}

}
