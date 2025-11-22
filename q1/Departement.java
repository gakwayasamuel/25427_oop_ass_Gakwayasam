package _25427.q1;

class Department extends Hospital {
    private String departmentName;
    private String departmentCode;

    public Department(int id, String createdDate, String updatedDate, String hospitalName,
                      String address, String phoneNumber, String email, String departmentName,
                      String departmentCode) throws HospitalDataException {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email);
        if (departmentName == null || departmentName.trim().isEmpty()) throw new HospitalDataException("Department name required");
        if (!departmentCode.matches("[A-Za-z0-9]{3,}")) throw new HospitalDataException("Department code must be alphanumeric and ≥3 characters");
        this.departmentName = departmentName;
        this.departmentCode = departmentCode;
    }

    public String getDepartmentName() { return departmentName; }
    public String getDepartmentCode() { return departmentCode; }
}