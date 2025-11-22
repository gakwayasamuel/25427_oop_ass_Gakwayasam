package _25427.q1;

class Bill extends Treatment {
    private double doctorFee;
    private double medicineCost;

    public Bill(int id, String createdDate, String updatedDate, String hospitalName,
                String address, String phoneNumber, String email, String patientName,
                int age, String gender, String contactNumber, String admissionDate,
                String roomNumber, double roomCharges, String diagnosis,
                String treatmentGiven, double treatmentCost, double doctorFee,
                double medicineCost) throws HospitalDataException {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email,
                patientName, age, gender, contactNumber, admissionDate, roomNumber, roomCharges,
                diagnosis, treatmentGiven, treatmentCost);
        if (doctorFee <= 0) throw new HospitalDataException("Doctor fee must be > 0");
        if (medicineCost <= 0) throw new HospitalDataException("Medicine cost must be > 0");
        this.doctorFee = doctorFee;
        this.medicineCost = medicineCost;
    }

    public double getDoctorFee() { return doctorFee; }
    public double getMedicineCost() { return medicineCost; }
}
