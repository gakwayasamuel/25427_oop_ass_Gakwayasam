package _25427.q2;

class Department extends School {
    private String departmentName;
    private String departmentCode;

    public Department(int id, String createdDate, String updatedDate, String schoolName,
                      String address, String phoneNumber, String email, String departmentName,
                      String departmentCode) throws SchoolDataException {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email);
        if (departmentName == null || departmentName.trim().isEmpty()) throw new SchoolDataException("Department name required");
        if (!departmentCode.matches("[A-Za-z0-9]{3,}")) throw new SchoolDataException("Department code must be alphanumeric and ≥3 characters");
        this.departmentName = departmentName;
        this.departmentCode = departmentCode;
    }

    public String getDepartmentName() { return departmentName; }
    public String getDepartmentCode() { return departmentCode; }
}
