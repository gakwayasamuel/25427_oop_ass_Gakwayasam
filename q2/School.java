package _25427.q2;

class School extends Entity {
    private String schoolName;
    private String address;
    private String phoneNumber;
    private String email;

    public School(int id, String createdDate, String updatedDate, String schoolName,
                  String address, String phoneNumber, String email) throws SchoolDataException {
        super(id, createdDate, updatedDate);
        if (schoolName == null || schoolName.trim().isEmpty()) throw new SchoolDataException("School name required");
        if (address == null || address.trim().isEmpty()) throw new SchoolDataException("Address required");
        if (!phoneNumber.matches("\\d{10}")) throw new SchoolDataException("Phone must be exactly 10 digits");
        if (!email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) throw new SchoolDataException("Invalid email format");
        this.schoolName = schoolName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getSchoolName() { return schoolName; }
    public String getAddress() { return address; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getEmail() { return email; }
}
