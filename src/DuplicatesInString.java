
public class DuplicatesInString
{

	public static void main(String[] args) 
	{
		 String string1 = "Response";
		String X= string1.toLowerCase();
	        int count;    
	        //Converts given string into character array  
	        char ch[] = X.toCharArray();  
	          
	        System.out.println("Duplicate characters in a given string: ");  
	        
	        
	        //Counts each character present in the string  
	        for(int i = 0; i <ch.length; i++) 
	        {  
	            count = 1;  
	            for(int j = i+1; j <ch.length; j++)
	            {  
	                if(ch[i] == ch[j] && ch[i] != ' ') 
	                {  
	                    count++;  
	                    //Set string[j] to 0 to avoid printing visited character  
	                    ch[j] = '0';  
	                }  
	            }  
	            //A character is considered as duplicate if count is greater than 1  
	            if(count > 1 && ch[i] != '0')  
	                System.out.println(ch[i]);
	           
	            //System.out.println("duplicates not allowed");
	            //break;
	        }  
	}

}
