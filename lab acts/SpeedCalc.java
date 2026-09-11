import java.util.Scanner;

public class SpeedCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float distance;
        float time;
        float speed;

        System.out.print("Enter distance traveled (km): ");
        distance = scanner.nextFloat();
        System.out.print("Enter time (hours): ");
        time = scanner.nextFloat();

        speed = distance / time;

        System.out.println("===== TRAVEL INFORMATION =====");
        System.out.printf("Distance: %.1f km%n", distance);
        System.out.printf("Time: %.1f hours%n", time);
        System.out.printf("Speed: %.1f km/h%n", speed);
    }
}
