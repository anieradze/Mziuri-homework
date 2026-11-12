
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 1
//        Scanner sc = new Scanner(System.in);
//
//        int[] arr = {1, 2, 3, 4, 5};
//
//        while (true) {
//            boolean allZero = true;
//
//            for (int i = 0; i < arr.length; i++) {
//                if (arr[i] != 0) {
//                    allZero = false;
//                    break;
//                }
//            }
//
//            if (allZero) {
//                break;
//            }
//
//            System.out.println("Enter a number:");
//            int num = sc.nextInt();
//
//            if (num >= 0 && num < arr.length) {
//                arr[num] = 0;
//            }
//
//            for (int i = 0; i < arr.length; i++) {
//                System.out.print(arr[i] + " ");
//            }
//            System.out.println();
//        }
//
//        System.out.println("All elements are zero!");


        // 2
//        int[] arr = {7, 1, 5, 3, 6, 4};
//
//        int min = arr[0];
//        int max = 0;
//
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] - min > max) {
//                max = arr[i] - min;
//            }
//
//            if (arr[i] < min) {
//                min = arr[i];
//            }
//        }
//
//        System.out.println("Maximum profit: " + max);


        // 3
//        int[] arr = {1, 2, 0, 2, 1};
//
//        boolean palindrome = true;
//
//        for (int i = 0; i < arr.length / 2; i++) {
//            if (arr[i] != arr[arr.length - 1 - i]) {
//                palindrome = false;
//                break;
//            }
//        }
//
//        if (palindrome) {
//            System.out.println("კი");
//        } else {
//            System.out.println("არა");
//        }


        // 4
        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 2, 1, 1, 4, 5, 2, 1, 4, 2};

        System.out.println("Enter a number to remove:");
        int num = sc.nextInt();

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != num) {
                count++;
            }
        }

        int[] newArr = new int[count];

        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != num) {
                newArr[j] = arr[i];
                j++;
            }
        }

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
