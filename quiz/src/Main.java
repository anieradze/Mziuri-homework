import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //1- c)class
        //2- b)4
        //3- d) 8 2
        //4- a)4
        //5- b)
        //6- c)
        //7- d) c
        //8- b
        //9- a
        //10-c
        //11- d
        //12- a
        //13- b
        //14- c
        //15- d

        //16

        Scanner scanner = new Scanner(System.in);
//        System.out.print("შეიყვანეთ დადებითი მთელი რიცხვი");
//        int num = scanner.nextInt();
//
//        int originalNum = num;
//        int reversedNum = 0;
//
//        while(num>0){
//            int digit = num % 10;
//            reversedNum = reversedNum* 10 + digit;
//            num = num/10;
//        }
//
//        System.out.println("შემობრუნებული " + reversedNum);
//
//        if(reversedNum == originalNum){
//            System.out.println(originalNum + "პალინდრომია");
//        }else{
//            System.out.println(originalNum + "არ არის პალინდრომი");
//        }

        //17

//        System.out.println("შეიყვანეთ n: ");
//        int n = scanner.nextInt();
//
//        for(int i = n; i >= 1; i--){
//            for(int j = i; j >= 1; j--){
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }

        //18
//
//        int[] arr = {1,2,3,4,5};
//        int first = arr[0];
//
//        for(int i = 0; i < arr.length - 1; i++){
//            arr[i] = arr[i + 1];
//        }
//
//        arr[arr.length - 1] = first;
//        System.out.println(Arrays.toString(arr));

        //19
//        int[] arr = {4, 9, 2, 9, 7};
//
//        int sum = 0;
//        for(int num : arr){
//            sum += num;
//        }
//
//        double average = (double)sum/arr.length;
//        System.out.println("საშუალო: " +average);
//
//        int count = 0;
//        System.out.println("საშუალოზე მეტი ელემენტებია");
//        for(int num : arr){
//            if(num > average){
//                System.out.println(num + " ");
//                count++;
//            }
//        }
//        System.out.println("\nსულ: " + count + "ელემენტი");

        //20
        int[][] arr = {
                {3, 1, 2},
                {7, 0, 4},
                {1, 1, 1}
        };
        int minSum = 0;
        for(int i = 0; i < arr.length; i++){
            minSum += arr[i][0];
        }
        int minColumn = 0;
        for(int j = 0; j < arr[0].length; j++){
            int sum = 0;
            for(int i = 0; i <arr.length; i++){
                sum += arr[i][j];
            }
            System.out.println("სვეტი " + j + ": "+ sum);

            if (sum < minSum){
                minSum = sum;
                minColumn = j;
            }
        }

        System.out.println("ყველაზე მცირე ჯამი აქვს სვეტს: " + minColumn);
    }
}
