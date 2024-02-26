import java.util.Scanner;

public class CtoF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius;
        boolean validInput;

        do {
            System.out.print("Enter temperature in Celsius: ");
            if (scanner.hasNextDouble()) {
                celsius = scanner.nextDouble();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                validInput = false;
                scanner.next(); // Clear the invalid input from the scanner
            }
        } while (!validInput);

        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }
}
