import java.util.ArrayList;
import java.util.List;

// Database access class to handle CRUD operations
public class MedicationDatabase {
    private List<Medication> medications;

    public MedicationDatabase() {
        this.medications = new ArrayList<>();
    }

    public void saveMedication(Medication medication) {
        medications.add(medication);
    }

    public Medication getMedication(String name) {
        for (Medication medication : medications) {
            if (medication.getName().equalsIgnoreCase(name)) {
                return medication;
            }
        }
        return null;
    }

}