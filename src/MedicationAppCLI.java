import java.util.Scanner;
public class MedicationAppCLI {
	private static MedicationApp medicationApp;
	private static Scanner scanner;

	public static void main(String[] args) {
        medicationApp = new MedicationApp();
        scanner = new Scanner(System.in);

        System.out.println("Welcome to Medication Management App!");
        boolean running = true;
        while (running) {
            printMenu();
            int choice = getUserChoice();
            switch (choice) {
                case 1:
                    addMedication();
                    break;
                case 2:
                    getMedicationInformation();
                    break;
                case 3:
                    sendMedicationReminder();
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
        scanner.close();
        System.out.println("Exiting Medication Management App. Goodbye!");
    }

private static void printMenu() {
        System.out.println