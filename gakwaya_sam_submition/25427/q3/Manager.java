package _25427.q3;

class Manager extends Department {
    private String managerName;
    private String managerEmail;
    private String phone;

    public Manager(int id, String createdDate, String updatedDate, String companyName,
                   String address, String phoneNumber, String email, String departmentName,
                   String departmentCode, String managerName, String managerEmail, String phone)
            throws PayrollDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email,
                departmentName, departmentCode);
        if (managerName == null || managerName.trim().isEmpty()) throw new PayrollDataException("Manager name required");
        if (!managerEmail.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) throw new PayrollDataException("Invalid manager email");
        if (!phone.matches("\\d{10}")) throw new PayrollDataException("Manager phone must be 10 digits");
        this.managerName = managerName;
        this.managerEmail = managerEmail;
        this.phone = phone;
    }

    public String getManagerName() { return managerName; }
}
