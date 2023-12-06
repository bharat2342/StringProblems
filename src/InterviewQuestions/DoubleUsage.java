package InterviewQuestions;

public class DoubleUsage {

	public static void main(String[] args) {
		
		Double d1=10.0/0.0;
		System.out.print(d1.isNaN() + "");
		System.out.print(d1.isInfinite());

	}

}
