
public class StringUpperLower {

	public static void main(String[] args) 
	{
		String s= "WelCome to AutoMAtion";
		int lower=0;
		int upper=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>=65 && ch<=90)
			{
				upper++;
			}
			else
			{
				lower++;
				
			}
			System.out.println("lower"   +lower);
			System.out.println("upper"   +upper);
		}

	}

}
