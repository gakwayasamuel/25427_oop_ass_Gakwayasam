package _25427.q3;

class Salary extends Deduction {
    private double basicSalary;

    public Salary(int id, String createdDate, String updatedDate, String companyName,
                  String address, String phoneNumber, String email, String employeeName,
                  int employeeId, String designation, String contactNumber,
                  int totalDays, int presentDays, int leaveDays,
                  double housingAllowance, double transportAllowance,
                  double taxDeduction, double loanDeduction, double basicSalary)
            throws PayrollDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email,
                employeeName, employeeId, designation, contactNumber, totalDays, presentDays, leaveDays,
                housingAllowance, transportAllowance, taxDeduction, loanDeduction);
        if (basicSalary <= 0) throw new PayrollDataException("Basic salary must be > 0");
        this.basicSalary = basicSalary;
    }

    public double getBasicSalary() { return basicSalary; }

    public double calculateNetSalary() {
        return basicSalary + getTotalAllowance() - getTotalDeduction();
    }
}
