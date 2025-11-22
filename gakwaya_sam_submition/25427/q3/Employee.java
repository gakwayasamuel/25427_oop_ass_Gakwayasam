package _25427.q3;

class Employee extends Company {
    private String employeeName;
    private int employeeId;
    private String designation;
    private String contactNumber;

    public Employee(int id, String createdDate, String updatedDate, String companyName,
                    String address, String phoneNumber, String email, String employeeName,
                    int employeeId, String designation, String contactNumber) throws PayrollDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email);
        if (employeeName == null || employeeName.trim().isEmpty())
            throw new PayrollDataException("Employee name required");
        if (employeeId <= 0)
            throw new PayrollDataException("Employee ID must be > 0");
        if (designation == null || designation.trim().isEmpty())
            throw new PayrollDataException("Designation required");
        if (!contactNumber.matches("\\d{10}"))
            throw new PayrollDataException("Contact must be 10 digits");
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.designation = designation;
        this.contactNumber = contactNumber;
    }

    public String getEmployeeName() { return employeeName; }
    public int getEmployeeId() { return employeeId; }
    public String getDesignation() { return designation; }
}