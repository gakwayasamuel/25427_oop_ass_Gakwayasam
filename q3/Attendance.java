package _25427.q3;

class Attendance extends Employee {
    private int totalDays;
    private int presentDays;
    private int leaveDays;

    public Attendance(int id, String createdDate, String updatedDate, String companyName,
                      String address, String phoneNumber, String email, String employeeName,
                      int employeeId, String designation, String contactNumber,
                      int totalDays, int presentDays, int leaveDays) throws PayrollDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email,
                employeeName, employeeId, designation, contactNumber);
        if (totalDays < 0 || presentDays < 0 || leaveDays < 0)
            throw new PayrollDataException("Days cannot be negative");
        if (presentDays > totalDays)
            throw new PayrollDataException("Present days cannot exceed total days");
        this.totalDays = totalDays;
        this.presentDays = presentDays;
        this.leaveDays = leaveDays;
    }

    public int getPresentDays() { return presentDays; }
    public int getTotalDays() { return totalDays; }
}
