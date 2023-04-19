import java.util.stream.Collectors;

public class ToCountVowelsWithoutRegex 
{

	public static void main(String[] args) 
	{
		String str= "This is the very Common Question that I've seen people asking";
		
		
		
		String vowels= str.chars()
				.filter(c -> "aeiouAEIOU".indexOf(c)>=0)
				.mapToObj(c->String.valueOf((char) c))
				.collect(Collectors.joining());
		
		
		
		System.out.println(vowels.length());
		System.out.println(vowels);
		
		
		

	}

}
