import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ToCountVowelsWithRegex
{

	public static void main(String[] args) 
	{
		
		String str= "This is the very Common Question that I've seen people asking";
		
		String vowels= Pattern.compile("[aeiouAEIOU]") 
				.matcher(str)
				.results()
				.map(match -> match.group())
				.collect(Collectors.joining());
		System.out.println("vowels in the string are" + " " +vowels);
		
		
		

	}

}
