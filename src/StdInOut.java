import java.util.Scanner;

public class StdInOut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[3];

        for (int i = 0; i < 3; i++)
            array[i] = scanner.nextInt();
        for (int i = 0; i < 3; i++)
            System.out.println(array[i]);

    }
}
