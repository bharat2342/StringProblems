package InterviewQuestions;

import java.util.Arrays;

class SplitFunction {

    public static String WordSplit(String[] strArr) {
        String sequence = strArr[0];
        String[] dictionary = strArr[1].split(",");

        for (int i = 1; i < sequence.length(); i++) {
            String firstWord = sequence.substring(0, i);
            String secondWord = sequence.substring(i);

            if (arrayContains(dictionary, firstWord) && arrayContains(dictionary, secondWord)) {
                return firstWord + "," + secondWord;
            }
        }

        return "not possible";
    }

    private static boolean arrayContains(String[] array, String target) {
        for (String str : array) {
            if (str.equals(target)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Provide input as an array directly
        String[] input = {"abcgefd", "a,ab,abc,abcg,b,c,dog,e,efd,zzzz"};

        // Call the WordSplit function and print the result
        String result = WordSplit(input);
        System.out.println("Input: " + Arrays.toString(input));
        System.out.println("Output: " + result);
    }
}
