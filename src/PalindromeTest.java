import java.time.LocalDateTime;
import java.time.Duration;

public class PalindromeTest {

    public static void main(String[] args) {

        String stringToTest = "Reliefpfeilerreliefpfeiler";
        LocalDateTime startTime;

        // save time
        startTime = LocalDateTime.now();

        System.out.println(palindromeTest1(stringToTest));

        // print time difference
        System.out.println("Duration 1: " + Duration.between(startTime, LocalDateTime.now()).toMillis());

        // save time
        startTime = LocalDateTime.now();

        System.out.println(palindromeTest2(stringToTest));

        // print time difference
        System.out.println("Duration 2: " + Duration.between(startTime, LocalDateTime.now()).toMillis());


    }

    /* Decides, whether the input String is a Palindrome or not.
    Uses the StringBuilder class including its reverse method.
    Return true or false resp.
     */

    public static boolean palindromeTest1(String stringToTest) {

        String stringToTestUpper = stringToTest.toUpperCase();

        String reverseString = new StringBuilder(stringToTestUpper).reverse().toString();

        return stringToTestUpper.equals(reverseString);
    }

    /* Decides, whether the input String is a Palindrome or not.
    Implemented without using the StringBuilder class and its reverse method.
    Return true or false resp.
     */

    public static boolean palindromeTest2(String stringToTest) {

        String stringToTestUpper = stringToTest.toUpperCase();

        int length = stringToTestUpper.length();

        String reverse = "";

        for (int i = 0; i < length; i++) {

            reverse += stringToTestUpper.charAt(length-1-i);
        }

        return stringToTestUpper.equals(reverse);
    }
}