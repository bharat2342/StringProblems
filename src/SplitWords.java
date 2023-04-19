
public class SplitWords {

	public static void main(String[] args) 
	{
		
			 
				String str = "Java is good "; 
				String [] words = str.split(" ", 5); 
		 
				for (String word : words) 
					System.out.println(word);
				
				  String x=words[0];
				  
				  System.out.println(x);
				  
				  StringBuilder sb=new StringBuilder(x); StringBuilder fstWord= sb.reverse();
				  System.out.println(fstWord);
				 
			} 
		} 

