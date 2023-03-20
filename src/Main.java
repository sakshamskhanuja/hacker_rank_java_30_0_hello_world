import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Scans the user input.
        Scanner scanner = new Scanner(System.in);

        // Stores the input line.
        String a = scanner.nextLine();

        // Closes the scanner.
        scanner.close();

        // Prints "Hello, World."
        System.out.println("Hello, World.");

        // Prints the entered line.
        System.out.println(a);
    }
}
