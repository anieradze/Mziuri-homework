
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1

        /*
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        double average = (double) sum / n;
        System.out.println(average);
        */


        // 2

        /*
        int n = sc.nextInt();
        int power = 1;

        while (power * 2 <= n) {
            power *= 2;
        }

        while (n > 0) {
            if (power <= n) {
                System.out.print(power + " ");
                n -= power;
            }

            power /= 2;
        }
        */


        // 3

        /*
        for (int i = 1; i <= 15; i++) {
            if (i % 2 == 0 || i == 5 || i == 7 || i == 11) {
                continue;
            }

            System.out.println(i);
        }
        */


        // 4

        /*
        String binary = sc.nextLine();
        int decimal = 0;

        for (int i = 0; i < binary.length(); i++) {
            decimal = decimal * 2 + (binary.charAt(i) - '0');
        }

        System.out.println(decimal);
        */


        // 5

        /*
        int n = sc.nextInt();
        String binary = "";

        while (n > 0) {
            int remainder = n % 2;
            binary = remainder + binary;
            n /= 2;
        }

        System.out.println(binary);
        */


        // 6

        /*
        Random random = new Random();

        int x = random.nextInt(100) + 1;
        int guess;

        do {
            System.out.println("Guess the number:");
            guess = sc.nextInt();

            if (guess < x) {
                System.out.println("Too small!");
            } else if (guess > x) {
                System.out.println("Too big!");
            } else {
                System.out.println("Correct!");
            }

        } while (guess != x);
        */

    }
}
