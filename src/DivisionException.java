import java.util.Scanner;

public class DivisionException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int y = scanner.nextInt();

        try {
            System.out.println(20 / y);
        } catch (ArithmeticException exception) {
            System.out.println("Division by zero is not allowed.");
        }

        scanner.close();
    }
}
