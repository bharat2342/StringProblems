package InterviewQuestions;

public class SplitTheName2 
{

	public static void main(String[] args) 
	{
		//Here the Keyword taken as "is" and then iterated and then went on to extract name and ID
		String input = "This is Chinnu, My ID is :12345";
		int len = input.length();
		String name = "";
		String id = "";
		int nameStart = -1;
		int idStart = -1;
		
		for (int i = 0; i < len; i++) 
		{
		    if (input.charAt(i) == ' ' && nameStart == -1) 
		    {
		        if (input.charAt(i+1) == 'i' && input.charAt(i+2) == 's' && input.charAt(i+3) == ' ') 
		        {
		            nameStart = i + 4;
		        }
		    }
		    if (input.charAt(i) == ',' && idStart == -1) 
		    {
		        idStart = i + 1;
		    }
		}
		for (int i = nameStart; i < idStart-1; i++)
		{
		    if (input.charAt(i) != ' ') 
		    {
		        name += input.charAt(i);
		    }
		}
		for (int i = idStart; i < len; i++) 
		{
		    if (Character.isDigit(input.charAt(i))) 
		    {
		        id += input.charAt(i);
		    }
		}
		System.out.println(name + ":" + id);
}
}
