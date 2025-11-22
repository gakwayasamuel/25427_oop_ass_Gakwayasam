package _25427.q1;

class Treatment extends Admission {
    private String diagnosis;
    private String treatmentGiven;
    private double treatmentCost;

    public Treatment(int id, String createdDate, String updatedDate, String hospitalName,
                     String address, String phoneNumber, String email, String patientName,
                     int age, String gender, String contactNumber, String admissionDate,
                     String roomNumber, double roomCharges, String diagnosis,
                     String treatmentGiven, double treatmentCost) throws HospitalDataException {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email,
                patientName, age, gender, contactNumber, admissionDate, roomNumber, roomCharges);
        if (diagnosis == null || diagnosis.trim().isEmpty()) throw new HospitalDataException("Diagnosis required");
        if (treatmentGiven == null || treatmentGiven.trim().isEmpty()) throw new HospitalDataException("Treatment given required");
        if (treatmentCost <= 0) throw new HospitalDataException("Treatment cost must be > 0");
        this.diagnosis = diagnosis;
        this.treatmentGiven = treatmentGiven;
        this.treatmentCost = treatmentCost;
    }

    public double getTreatmentCost() { return treatmentCost; }
}
