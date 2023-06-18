package InterviewQuestions;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1= new String("Java");
		String s2= new String("Java");
		boolean x= s1==s2;
		System.out.println(x); //since we are comparing object reference so it will come as false
		//if we use s1.equals(s2) then it will give true
		
		
		String s4 = "hello";
		String s5 = "hello";
		String s6 = new String("hello");

		System.out.println(s4 == s5); // true, both variables point to the same object in memory
		System.out.println(s5 == s6); // false, s6 is a different object in memory
		System.out.println(s4.equals(s5)); // true, both variables contain the same string of characters
		System.out.println(s1.equals(s6)); // false, both variables contain the same string of characters


	}

}
