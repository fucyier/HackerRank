import java.util.Arrays;
import java.util.Scanner;

public class JavaStringReverse {

    public static void main(String... args) {
        //Input
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        char[] words = word.toCharArray();
        char[] reverseWords = new char[words.length];
        for (int i = 0; i < words.length; i++)
            reverseWords[words.length - 1-i] = words[i];
        String yes_or_no = "No";
        if (Arrays.equals(words,reverseWords)) yes_or_no = "Yes";

        System.out.println(yes_or_no);

    }
}
