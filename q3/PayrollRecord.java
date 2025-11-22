package _25427.q3;

final class PayrollRecord extends Salary {
    public PayrollRecord(int id, String createdDate, String updatedDate, String companyName,
                         String address, String phoneNumber, String email, String employeeName,
                         int employeeId, String designation, String contactNumber,
                         int totalDays, int presentDays, int leaveDays,
                         double housingAllowance, double transportAllowance,
                         double taxDeduction, double loanDeduction, double basicSalary)
            throws PayrollDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email,
                employeeName, employeeId, designation, contactNumber, totalDays, presentDays, leaveDays,
                housingAllowance, transportAllowance, taxDeduction, loanDeduction, basicSalary);
    }

    public void displayPayroll() {
        String ID = "25427";
        System.out.println(ID + " ================= PAYROLL RECORD ===================");
        System.out.println(ID + " Company   : " + getCompanyName());
        System.out.println(ID + " Employee  : " + getEmployeeName() + " | ID: " + getEmployeeId());
        System.out.println(ID + " Designation: " + getDesignation());
        System.out.println(ID + " Attendance : " + getPresentDays() + "/" + getTotalDays() + " days");
        System.out.println(ID);
        System.out.println(ID + " Basic Salary       : " + getBasicSalary());
        System.out.println(ID + " Housing Allowance   : " + getHousingAllowance());
        System.out.println(ID + " Transport Allowance  : " + getTransportAllowance());
        System.out.println(ID + " Tax Deduction      : " + getTaxDeduction());
        System.out.println(ID + " Loan Deduction     : " + getLoanDeduction());
        System.out.println(ID + " ———————————————————————");
        System.out.println(ID + " NET SALARY        : " + calculateNetSalary());
        System.out.println(ID + " ================================================");
    }
}
