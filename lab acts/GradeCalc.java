import java.util.Scanner;

public class GradeCalc {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int prelim;
        int midterm;
        int finals;
        int total;
        float average;

        System.out.print("Enter Prelim Score: ");
        prelim = scanner.nextInt();
        System.out.print("Enter Midterm Score: ");
        midterm = scanner.nextInt();
        System.out.print("Enter Final Score: ");
        finals = scanner.nextInt();

        total = prelim + midterm + finals;
        average = total / 3f;

        System.out.println("===== STUDENT GRADE RESULT =====");
        System.out.println("Prelim Score: " + prelim);
        System.out.println("Midterm Score: " + midterm);
        System.out.println("Final Score: " + finals);
        System.out.println("Total Score: " + total);
        System.out.printf("Average: %.2f%n", average);
    }
}
