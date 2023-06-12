public class MedicationApp {
    private MedicationDatabase database;
    private NotificationService notificationService;

    public MedicationApp() {
        database = new MedicationDatabase();
        notificationService = new NotificationService();
    }

    public void addMedication(Medication medication) {
        database.saveMedication(medication);
    }

    public Medication getMedicationInformation(String name) {
        return database.getMedication(name);
    }

    public void sendMedicationReminder(String message) {
        notificationService.sendReminder(message);
    }


    public static void main(String[] args) {
        MedicationApp app = new MedicationApp();

        Medication medication = new Medication("Aspirin", "10 mg", 2, "Take with food");
        app.addMedication(medication);

        Medication retrievedMedication = app.getMedicationInformation("Aspirin");
        System.out.println("Medication: " + retrievedMedication.getName());

        app.sendMedicationReminder("It's time to take your Aspirin!");
    }
}