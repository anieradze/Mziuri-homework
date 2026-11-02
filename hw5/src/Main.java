
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // 1

        int[] b = new int[12];

        for (int i = 0; i < b.length; i++) {
            b[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(b));


        // 2

        /*
        int[] b = new int[12];
        int sum = 0;
        long product = 1;

        for (int i = 0; i < b.length; i++) {
            b[i] = random.nextInt(10) + 1;
            sum += b[i];
            product *= b[i];
        }

        double average = (double) sum / b.length;

        System.out.println(Arrays.toString(b));
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Average: " + average);
        */


        // 3

        /*
        int[] b = new int[20];

        for (int i = 0; i < b.length; i++) {
            b[i] = random.nextInt(21);
        }

        int max = b[0];
        int min = b[0];

        for (int i = 0; i < b.length; i++) {
            if (b[i] > max) {
                max = b[i];
            }

            if (b[i] < min) {
                min = b[i];
            }
        }

        System.out.println(Arrays.toString(b));
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        */


        // 4

        /*
        int[] b = new int[15];

        for (int i = 0; i < b.length; i++) {
            b[i] = i + 1;
        }

        System.out.println(Arrays.toString(b));
        */


        // 5

        /*
        int[] b = new int[15];
        int sum = 0;
        long product = 1;

        for (int i = 0; i < b.length; i++) {
            b[i] = i + 1;
            sum += b[i];
            product *= b[i];
        }

        double average = (double) sum / b.length;

        System.out.println(Arrays.toString(b));
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Average: " + average);
        */


        // 6

        /*
        int[] b = {3, 7, 12, 5, 9, 20};

        System.out.println(Arrays.toString(b));
        System.out.print("Enter x: ");

        int x = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < b.length; i++) {
            if (b[i] == x) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Number found!");
        } else {
            System.out.println("Number not found!");
        }
        */


        // 7

        /*
        int[] b = {2, 4, 6, 8, 10};

        System.out.println(Arrays.toString(b));
        System.out.print("Enter a number: ");

        int x = sc.nextInt();

        int[] newArray = new int[b.length + 1];

        newArray[0] = x;

        for (int i = 0; i < b.length; i++) {
            newArray[i + 1] = b[i];
        }

        System.out.println(Arrays.toString(newArray));
        */


        // 8

        /*
        int[] b = {3, 4, 5, 7, 9};
        int target = 8;

        System.out.println(Arrays.toString(b));

        boolean found = false;

        for (int i = 0; i < b.length; i++) {
            for (int j = i + 1; j < b.length; j++) {

                if (b[i] + b[j] == target) {
                    System.out.println(b[i] + " + " + b[j] + " = " + target);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No pair found!");
        }
        */


        // 9

        /*
        int[] b = {2, 4, 6, 8, 10};

        System.out.println(Arrays.toString(b));
        System.out.print("Choose a number to remove: ");

        int x = sc.nextInt();

        int count = 0;

        for (int i = 0; i < b.length; i++) {
            if (b[i] != x) {
                count++;
            }
        }

        int[] newArray = new int[count];
        int j = 0;

        for (int i = 0; i < b.length; i++) {
            if (b[i] != x) {
                newArray[j] = b[i];
                j++;
            }
        }

        System.out.println(Arrays.toString(newArray));
        */


        // 10

        /*
        int[] b = {1, 2, 3, 4, 5};

        while (true) {
            System.out.println(Arrays.toString(b));

            boolean allZero = true;

            for (int i = 0; i < b.length; i++) {
                if (b[i] != 0) {
                    allZero = false;
                    break;
                }
            }

            if (allZero) {
                System.out.println("All elements are zero!");
                break;
            }

            System.out.print("Enter a number from the array: ");
            int x = sc.nextInt();

            boolean found = false;

            for (int i = 0; i < b.length; i++) {
                if (b[i] == x && x != 0) {
                    b[i] = 0;
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Number not found!");
            }
        }
        */

    }
}
