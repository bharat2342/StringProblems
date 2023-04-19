
public class SubStringExamples 
{

	public static void main(String[] args) 
	{
		String input = "This is a sample input string";
		String substring = "sample";
		int startingIndex = input.indexOf(substring);
		System.out.println(startingIndex);
		String output=input.substring(0, startingIndex) + input.substring(startingIndex + substring.length());
		System.out.println(output);

	}

}
