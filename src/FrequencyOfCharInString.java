
public class FrequencyOfCharInString {

	public static void main(String[] args) 
	{
		String str = "Automation Testing";
		String X=str.toLowerCase();
        
		
		int[] freq = new int[X.length()];
        int i, j;  
         
        
        
        //Converts given string into character array  
        char string[] = X.toCharArray();  
          
        for(i = 0; i <X.length(); i++) 
        {  
            freq[i] = 1;  
            for(j = i+1; j <X.length(); j++)
            {  
                if(string[i] == string[j])
                {  
                    freq[i]++;  
                      
                    //Set string[j] to 0 to avoid printing visited character  
                    string[j] = '0';  
                }  
            }  
        }  
          
        //Displays the each character and their corresponding frequency  
        System.out.println("Characters and their corresponding frequencies");  
        for(i = 0; i <freq.length; i++) 
        {  
            if(string[i] != ' ' && string[i] != '0')  
                System.out.print(string[i] + "-" + freq[i] +" ");  
        }  

	}

}
