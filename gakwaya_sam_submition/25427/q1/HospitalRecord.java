package _25427.q1;

final class HospitalRecord extends Bill {
    public HospitalRecord(int id, String createdDate, String updatedDate, String hospitalName,
                          String address, String phoneNumber, String email, String patientName,
                          int age, String gender, String contactNumber, String admissionDate,
                          String roomNumber, double roomCharges, String diagnosis,
                          String treatmentGiven, double treatmentCost, double doctorFee,
                          double medicineCost) throws HospitalDataException {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email,
                patientName, age, gender, contactNumber, admissionDate, roomNumber, roomCharges,
                diagnosis, treatmentGiven, treatmentCost, doctorFee, medicineCost);
    }

    public double generateBill() {
        return getRoomCharges() + getTreatmentCost() + getDoctorFee() + getMedicineCost();
    }

    public void displayRecord() {
        System.out.println("=== HOSPITAL RECORD ===");
        System.out.println("Hospital: " + getHospitalName() + " | Address: " + getAddress());
        System.out.println("Patient: " + getPatientName() + " | Age: " + getAge() + " | Gender: " + getGender());
        System.out.println("Admission Date: " + getAdmissionDate() + " | Room: " + getRoomNumber());
        System.out.println("\n--- CHARGES ---");
        System.out.println("Room Charges     : " + getRoomCharges());
        System.out.println("Treatment Cost   : " + ((Treatment)this).getTreatmentCost());
        System.out.println("Doctor Fee       : " + getDoctorFee());
        System.out.println("Medicine Cost    : " + getMedicineCost());
        System.out.println("TOTAL BILL       : " + generateBill());
        System.out.println("=======================");
    }
}
