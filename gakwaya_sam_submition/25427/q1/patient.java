package _25427.q1;

class Patient extends Hospital {
    private String patientName;
    private int age;
    private String gender;
    private String contactNumber;

    public Patient(int id, String createdDate, String updatedDate, String hospitalName,
                   String address, String phoneNumber, String email, String patientName,
                   int age, String gender, String contactNumber) throws HospitalDataException {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email);
        if (patientName == null || patientName.trim().isEmpty()) throw new HospitalDataException("Patient name required");
        if (age <= 0) throw new HospitalDataException("Age must be greater than 0");
        if (!gender.equals("Male") && !gender.equals("Female") && !gender.equals("Other"))
            throw new HospitalDataException("Gender must be Male/Female/Other");
        if (!contactNumber.matches("\\d{10}")) throw new HospitalDataException("Contact number must be 10 digits");
        this.patientName = patientName;
        this.age = age;
        this.gender = gender;
        this.contactNumber = contactNumber;
    }

    public String getPatientName() { return patientName; }
    public int getAge() { return age; }
    public String getGender() { return gender; }
}