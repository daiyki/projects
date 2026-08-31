import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("WELCOME TO BILL CALC SMTH\n ENTER YOUR CHOICE\n 1. Calculate elec Bill \n 2. Estimate elec Bill");
        String userInput = scanner.nextLine();

        if (userInput.equalsIgnoreCase("calculate elec bill")) {
            System.out.print("Enter your kwh:");
            int kwh = scanner.nextInt();
            int bill = kwh * 13;
            System.out.println("Your calculation is:" + bill + "pesos");
        } else if (userInput.equalsIgnoreCase("Estimate elec bill")) {
            System.out.print("Enter watts:");
            int watts = scanner.nextInt();
            System.out.print("Enter hours");
            int hours = scanner.nextInt();
            int dkwh = watts * hours;
            int kwh = dkwh / 1000;
            int bill = kwh * 13;
            System.out.println("Your estimated bill is:" + bill +"pesos");
        } else{
            System.out.println("Invalid output");
        }
    }
}