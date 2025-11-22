package _25427.q1;

class Hospital extends Entity {
    private String hospitalName;
    private String address;
    private String phoneNumber;
    private String email;

    public Hospital(int id, String createdDate, String updatedDate, String hospitalName,
                    String address, String phoneNumber, String email) throws HospitalDataException {
        super(id, createdDate, updatedDate);
        if (hospitalName == null || hospitalName.trim().isEmpty()) throw new HospitalDataException("Hospital name required");
        if (address == null || address.trim().isEmpty()) throw new HospitalDataException("Address required");
        if (!phoneNumber.matches("\\d{10}")) throw new HospitalDataException("Phone must be 10 digits");
        if (!email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) throw new HospitalDataException("Invalid email format");
        this.hospitalName = hospitalName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getHospitalName() { return hospitalName; }
    public String getAddress() { return address; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getEmail() { return email; }
}
