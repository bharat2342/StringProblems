
public class ToReplaceSpecialChars {

	public static void main(String[] args) 
	{
		String str= "+91-(79877) 2090";
		str=str.replaceAll("[-+^() ]", "");
		System.out.println("Reversed word: "+ str);
       

	}

}
