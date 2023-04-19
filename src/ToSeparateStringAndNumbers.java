
public class ToSeparateStringAndNumbers {
	static void splitString(String str)
    {
        StringBuffer alpha = new StringBuffer(),
        num = new StringBuffer(), special = new StringBuffer();
         
        for (int i=0; i<str.length(); i++)
        {
            if (Character.isDigit(str.charAt(i)))
                num.append(str.charAt(i));
            else if(Character.isAlphabetic(str.charAt(i)))
                alpha.append(str.charAt(i));
            else
                special.append(str.charAt(i));
        }
      
        System.out.println(alpha);
        System.out.println(num);
        System.out.println(special);
    }

	public static void main(String[] args) 
	{
	
		 String str = "abcd1234";
	        splitString(str);
		

	}
	//This is used when in split with non-digit and digit
	/*
	 * String str = "abcd1234"; 
	 * String[] part = str.split("(?<=\\D)(?=\\d)");
	 * System.out.println(part[0]);
	 * System.out.println(part[1]);
	 */
}
