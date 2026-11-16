class Book {
    String title;
    String author;
    int pages;

    Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.pages = 0;
    }

    void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
    }
}


class Rectangle {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double perimeter() {
        return 2 * (length + width);
    }

    double area() {
        return length * width;
    }

    double diagonal() {
        return Math.sqrt(length * length + width * width);
    }

    boolean isSquare() {
        return Math.abs(length - width) < 0.000001;
    }
}


class Time {
    int hour;
    int minute;
    int second;

    Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    void displayTime() {
        System.out.printf("%02d:%02d:%02d%n", hour, minute, second);
    }
}


public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter", "J.K. Rowling", 350);
        Book book2 = new Book("The Hobbit", "J.R.R. Tolkien");

        System.out.println("BOOK 1:");
        book1.displayBookInfo();

        System.out.println();

        System.out.println("BOOK 2:");
        book2.displayBookInfo();

        System.out.println();


        Rectangle rectangle = new Rectangle(5.5, 5.5);

        System.out.println("RECTANGLE:");
        System.out.println("Perimeter: " + rectangle.perimeter());
        System.out.println("Area: " + rectangle.area());
        System.out.println("Diagonal: " + rectangle.diagonal());
        System.out.println("Is square: " + rectangle.isSquare());

        System.out.println();


        Time time = new Time(14, 5, 9);

        System.out.println("TIME:");
        time.displayTime();
    }
}
