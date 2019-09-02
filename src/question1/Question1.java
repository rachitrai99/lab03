package question1;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        double s = 0;
        for (int i = 1; i <= number; i++) {
            s = s + 1 / (double) i;
        }
        System.out.println(s);
        scanner.close();
    }
}
