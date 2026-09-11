import java.util.Scanner;

public class Arithmetic{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int firstNumber;
        int secondNumber;

        System.out.print("Enter First Number: ");
        firstNumber = scanner.nextInt();
        System.out.print("Enter Second Number: ");
        secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;
        int difference = firstNumber - secondNumber;
        int product = firstNumber * secondNumber;
        int quotient = firstNumber / secondNumber;
        int modulo = firstNumber % secondNumber;

        System.out.println("===== ARITHMETIC OPERATIONS =====");
        System.out.println("First Number: " + firstNumber);
        System.out.println("Second Number: " + secondNumber);
        System.out.println("Addition: " + sum);
        System.out.println("Subtractiom: " + difference);
        System.out.println("Multiplication: " + product);
        System.out.println("Division: " + quotient);
        System.out.println("Modulus: " + modulo);

    }
}