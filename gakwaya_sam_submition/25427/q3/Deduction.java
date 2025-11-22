package _25427.q3;

class Deduction extends Allowance {
    private double taxDeduction;
    private double loanDeduction;

    public Deduction(int id, String createdDate, String updatedDate, String companyName,
                     String address, String phoneNumber, String email, String employeeName,
                     int employeeId, String designation, String contactNumber,
                     int totalDays, int presentDays, int leaveDays,
                     double housingAllowance, double transportAllowance,
                     double taxDeduction, double loanDeduction) throws PayrollDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email,
                employeeName, employeeId, designation, contactNumber, totalDays, presentDays, leaveDays,
                housingAllowance, transportAllowance);
        if (taxDeduction < 0 || loanDeduction < 0)
            throw new PayrollDataException("Deduction cannot be negative");
        this.taxDeduction = taxDeduction;
        this.loanDeduction = loanDeduction;
    }

    public double getTaxDeduction() { return taxDeduction; }
    public double getLoanDeduction() { return loanDeduction; }
    public double getTotalDeduction() { return taxDeduction + loanDeduction; }
}