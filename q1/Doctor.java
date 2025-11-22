package _25427.q1;

class Doctor extends Department {
    private String doctorName;
    private String specialization;
    private String doctorEmail;
    private String phone;

    public Doctor(int id, String createdDate, String updatedDate, String hospitalName,
                  String address, String phoneNumber, String email, String departmentName,
                  String departmentCode, String doctorName, String specialization,
                  String doctorEmail, String phone) throws HospitalDataException {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email,
                departmentName, departmentCode);
        if (doctorName == null || doctorName.trim().isEmpty()) throw new HospitalDataException("Doctor name required");
        if (specialization == null || specialization.trim().isEmpty()) throw new HospitalDataException("Specialization required");
        if (!doctorEmail.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) throw new HospitalDataException("Invalid doctor email");
        if (!phone.matches("\\d{10}")) throw new HospitalDataException("Doctor phone must be 10 digits");
        this.doctorName = doctorName;
        this.specialization = specialization;
        this.doctorEmail = doctorEmail;
        this.phone = phone;
    }

    public String getDoctorName() { return doctorName; }
    public String getSpecialization() { return specialization; }
}
