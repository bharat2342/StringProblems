package InterviewQuestions;

public class SplitTheName 
{

			public static void main(String[] args) 
			{
					
				String str ="This is satish, my ID is 12345";
				String[] arrSplit = str.split(" ");
			    
				for (int i=0;i<arrSplit.length;i++) 
				{
					System.out.println(arrSplit[i]);
					String findWord="satish";
					if(arrSplit[i]==findWord)
					{
						System.out.println(findWord + ":");
						//break;
						 
					}
					
					
				}
			
			//Out put= satish:12345	
			
				/*
				 * String findWord="satish";
				 * 
				 * System.out.println(wordcount(str) + " words.");
				 *  int i=str.indexOf(findWord);
				 * if(i>0) System.out.println(str.substring(i, i+findWord.length())); 
				 * else
				 * System.out.println("string not found");
				 */
				/*
				 * String findWord="satish"; int j=str.indexOf(findWord); if(j>0)
				 * System.out.println(str.substring(j, j+findWord.length())); break;
				 */
		     

			}

	}
