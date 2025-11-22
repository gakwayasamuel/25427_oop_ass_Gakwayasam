package _25427.q3;

class Department extends Company {
    private String departmentName;
    private String departmentCode;

    public Department(int id, String createdDate, String updatedDate, String companyName,
                      String address, String phoneNumber, String email, String departmentName,
                      String departmentCode) throws PayrollDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email);
        if (departmentName == null || departmentName.trim().isEmpty()) throw new PayrollDataException("Department name required");
        if (!departmentCode.matches("[A-Za-z0-9]{3,}")) throw new PayrollDataException("Department code ≥3 alphanumeric chars");
        this.departmentName = departmentName;
        this.departmentCode = departmentCode;
    }

    public String getDepartmentName() { return departmentName; }
    public String getDepartmentCode() { return departmentCode; }
}
