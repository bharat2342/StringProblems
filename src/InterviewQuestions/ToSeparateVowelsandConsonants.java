package InterviewQuestions;

public class ToSeparateVowelsandConsonants
{

	public static void main(String[] args) 
	{
		String inputString = "Chinnu is an automation test engineer";
        String vowels = "";
        String consonants = "";

        inputString = inputString.toLowerCase(); // Convert the input string to lowercase for case-insensitive comparison

        for (int i = 0; i < inputString.length(); i++)
        {
            char ch = inputString.charAt(i);
            if (Character.isLetter(ch)) 
            { // Check if the character is a letter
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
                {
                    vowels += ch; // Add the vowel to the vowels string
                } 
                else 
                {
                    consonants += ch; // Add the consonant to the consonants string
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
		
		
		
		

	}

}
