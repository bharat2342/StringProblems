
public class DuplicatesInStringMethod2 
{
	public static void main(String[] args) 
	{
		 String str = "Automation is good";
		 String X =str.toLowerCase();
	     char[] ch = X.toCharArray();
	      
	      
	      
	      System.out.println("The string is:" + X);
	      System.out.print("Duplicate Characters in above string are: ");
	      
	      for (int i = 0; i < X.length(); i++)
	      {
	         for (int j = i + 1; j < X.length(); j++)
	         {
	            if (ch[i] == ch[j])
	            {
	               System.out.print(ch[j] + " ");
	               break;
	            }
	         }
	      }

	}

}
