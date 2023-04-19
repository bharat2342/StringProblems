
public class StringReverse {

	public static void main(String[] args) 
	{
		
		String str= "Bharat", nstr="";
        char ch;
      //String y=  str.toLowerCase();
      //System.out.print("Original word: ");
      //System.out.println("Geeks"); //Example word
        
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); //extracts each character
        nstr= ch+nstr; //adds each character in front of the existing string
      }
      System.out.println("Reversed word: "+ nstr);

	}

}
