import java.util.Scanner;

class Car {
    String brand;
    String model;
    int year;
    String number;

    void printInfo() {
        System.out.println("Marka: " + brand);
        System.out.println("Modeli: " + model);
        System.out.println("Gamshvebis weli: " + year);
        System.out.println("Saxelmwifo nomeri: " + number);
        System.out.println();
    }
}

public class Main {
    static int sumMultiples(int a, int b, int k) {
        if (a > b) {
            return 0;
        }
        if (a % k == 0) {
            return a + sumMultiples(a + 1, b, k);
        }
        return sumMultiples(a + 1, b, k);
    }

    static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sum(n - 1);
    }

    static int power(int a, int n) {
        if (n == 0) {
            return 1;
        }
        return a * power(a, n - 1);
    }

    static int countZeros(int n) {
        if (n == 0) {
            return 1;
        }

        if (n < 10) {
            return 0;
        }

        if (n % 10 == 0) {
            return 1 + countZeros(n / 10);
        }

        return countZeros(n / 10);
    }

    static void checkZeros(int n) {
        int count = countZeros(Math.abs(n));

        System.out.println("Nulebis raodenoba: " + count);

        if (count % 2 == 0) {
            System.out.println("Nulebis raodenoba luwia");
        } else {
            System.out.println("Nulebis raodenoba kentia");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Car car1 = new Car();
        car1.brand = "BMW";
        car1.model = "M5";
        car1.year = 2022;
        car1.number = "AA-123-AA";

        Car car2 = new Car();
        car2.brand = "Mercedes";
        car2.model = "C-Class";
        car2.year = 2023;
        car2.number = "BB-456-BB";

        car1.printInfo();
        car2.printInfo();

        System.out.print("Sheiyvanet a, b da k: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();

        if (k != 0) {
            System.out.println("Jami: " + sumMultiples(a, b, k));
        } else {
            System.out.println("k ar unda iyos 0");
        }

        System.out.print("Sheiyvanet n: ");
        int n = sc.nextInt();

        System.out.println("Jami: " + sum(n));
        System.out.print("Sheiyvanet a da n: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("Xarisxi: " + power(x, y));
        
        checkZeros(10020);
        checkZeros(30500);
        checkZeros(12345);
        checkZeros(100000);

        sc.close();
    }
}