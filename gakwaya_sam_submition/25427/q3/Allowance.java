package _25427.q3;

class Allowance extends Attendance {
    private double housingAllowance;
    private double transportAllowance;

    public Allowance(int id, String createdDate, String updatedDate, String companyName,
                     String address, String phoneNumber, String email, String employeeName,
                     int employeeId, String designation, String contactNumber,
                     int totalDays, int presentDays, int leaveDays,
                     double housingAllowance, double transportAllowance) throws PayrollDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email,
                employeeName, employeeId, designation, contactNumber, totalDays, presentDays, leaveDays);
        if (housingAllowance < 0 || transportAllowance < 0)
            throw new PayrollDataException("Allowance cannot be negative");
        this.housingAllowance = housingAllowance;
        this.transportAllowance = transportAllowance;
    }

    public double getHousingAllowance() { return housingAllowance; }
    public double getTransportAllowance() { return transportAllowance; }
    public double getTotalAllowance() { return housingAllowance + transportAllowance; }
}
