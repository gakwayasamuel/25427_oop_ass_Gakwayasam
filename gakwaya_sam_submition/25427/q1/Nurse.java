package _25427.q1;

class Nurse extends Department {
    private String nurseName;
    private String shift;
    private int yearsOfExperience;

    public Nurse(int id, String createdDate, String updatedDate, String hospitalName,
                 String address, String phoneNumber, String email, String departmentName,
                 String departmentCode, String nurseName, String shift, int yearsOfExperience)
            throws HospitalDataException {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email,
                departmentName, departmentCode);
        if (nurseName == null || nurseName.trim().isEmpty()) throw new HospitalDataException("Nurse name required");
        if (!shift.equals("Day") && !shift.equals("Night")) throw new HospitalDataException("Shift must be Day or Night");
        if (yearsOfExperience < 0) throw new HospitalDataException("Years of experience cannot be negative");
        this.nurseName = nurseName;
        this.shift = shift;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getNurseName() { return nurseName; }
    public String getShift() { return shift; }
}