package InterviewQuestions;

public class SplitName3 
{

	public static void main(String[] args) 
	{
		String input = "This is Chinnu, My ID is :12345";
		int len = input.length();
		String name = "";
		String id = "";
		int nameStart = -1;
		int idStart = -1;
		int i = 0;
		String keyword = "is";
		
		while (i < len)
		{
		    if (input.charAt(i) == ' ' && nameStart == -1) 
		    {
		        if (input.substring(i+1, i+1+keyword.length()).equals(keyword) && input.charAt(i+1+keyword.length()) == ' ')
		        {
		            nameStart = i + keyword.length() + 2;
		        }
		        else {
		            i++;
		        }
		    }
		    if (input.charAt(i) == ',' && idStart == -1) {
		        idStart = i + 1;
		    }
		    i++;
		}

		for (int j = nameStart; j < idStart-1; j++)
		{
		    if (input.charAt(j) != ' ')
		    {
		        name += input.charAt(j);
		    }
		}

		for (int j = idStart; j < len; j++)
		{
		    if (Character.isDigit(input.charAt(j)))
		    {
		        id += input.charAt(j);
		    }
		}
		System.out.println(name + ":" + id);

		/*
		 * The input string, length of the string, variables for storing the name and
		 * ID, and variables for storing the starting index of the name and ID are
		 * defined in the same way as before.
		 * 
		 * A new variable "keyword" is defined and initialized with the value "is". This
		 * variable will be used to check for the keyword in the input string.
		 * 
		 * A while loop is used to iterate through the characters of the input string.
		 * The loop starts from the first character and goes until the last character.
		 * 
		 * Within the while loop, an if statement is used to check if the current
		 * character is a space and the "nameStart" variable is -1. If these conditions
		 * are true, then it checks if the next characters equal to the keyword defined
		 * in the variable. If these conditions are true, then the "nameStart" variable
		 * is set to the current index + keyword.length() + 2. This is to find the
		 * starting index of the name.
		 * 
		 * Another if statement is used to check if the current character is a comma and
		 * the "idStart" variable is -1. If these conditions are true, then the
		 * "idStart" variable is set to the current index + 1. This is to find the
		 * starting index of the id.
		 * 
		 * Once the while loop is finished, the code uses two for loops to extract the
		 * name and id. First loop starts from the "nameStart" index and goes until the
		 * "idStart" index - 1. Within this loop, it checks if the current character is
		 * not a space and if it's true, then it concatenates that character to the
		 * "name" variable.
		 * 
		 * Second for loop starts from the "idStart" index and goes until the last
		 * character. Within this loop, it checks if the current character is a digit
		 * and if it's true, then it concatenates that digit to the "id" variable.
		 * 
		 * Finally, the code prints the concatenated "name" and "id" variables separated
		 * by a colon (:)
		 */
	}

}
