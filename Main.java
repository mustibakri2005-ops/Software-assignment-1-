import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> watchOrder = new ArrayList<>();

        watchOrder.add("Fate/Zero");
        watchOrder.add("Fate/stay night: Unlimited Blade Works");
        watchOrder.add("Fate/stay night: Heaven's Feel");
        watchOrder.add("Fate/strange Fake - Whispers of Dawn (TV Special)");

        boolean isRunning = true;

        System.out.println("Welcome to the Watch Order Tracker!");

        while (isRunning) {
            System.out.println("\n--- Main Menu ---");
            System.out.println("1. View Current Watch Order");
            System.out.println("2. Add New Entry");
            System.out.println("3. Exit");
            System.out.print("Choose an option (1-3): ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.println("\n--- Saved Timeline ---");
                for (int i = 0; i < watchOrder.size(); i++) {
                    System.out.println((i + 1) + ". " + watchOrder.get(i));
                }
            } else if (choice == 2) {
                System.out.print("\nEnter the name to add to the timeline: ");
                String newEntry = scanner.nextLine();
                watchOrder.add(newEntry);
                System.out.println("Successfully added '" + newEntry + "' to the list!");
            } else if (choice == 3) {
                System.out.println("Exiting tracker. Goodbye!");
                isRunning = false;
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}