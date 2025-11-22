package _25427.q1;

class Admission extends Patient {
    private String admissionDate;
    private String roomNumber;
    private double roomCharges;

    public Admission(int id, String createdDate, String updatedDate, String hospitalName,
                     String address, String phoneNumber, String email, String patientName,
                     int age, String gender, String contactNumber, String admissionDate,
                     String roomNumber, double roomCharges) throws HospitalDataException {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email,
                patientName, age, gender, contactNumber);
        if (admissionDate == null || admissionDate.trim().isEmpty()) throw new HospitalDataException("Admission date required");
        if (roomNumber == null || roomNumber.trim().isEmpty()) throw new HospitalDataException("Room number required");
        if (roomCharges <= 0) throw new HospitalDataException("Room charges must be > 0");
        this.admissionDate = admissionDate;
        this.roomNumber = roomNumber;
        this.roomCharges = roomCharges;
    }

    public double getRoomCharges() { return roomCharges; }
    public String getAdmissionDate() { return admissionDate; }
    public String getRoomNumber() { return roomNumber; }
}
