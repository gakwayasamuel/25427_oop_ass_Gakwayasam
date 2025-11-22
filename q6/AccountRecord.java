package _25427.q6;

final class AccountRecord extends Payment {

    public AccountRecord(int id, String createdDate, String updatedDate, String bankName,
                         String branchCode, String address, String accountNumber,
                         String accountType, double balance, String customerName,
                         String email, String phoneNumber, String transactionId,
                         String transactionType, double amount, double loanAmount,
                         double interestRate, int duration, double paymentAmount,
                         String paymentDate) throws BankDataException {
        super(id, createdDate, updatedDate, bankName, branchCode, address,
                accountNumber, accountType, balance, customerName, email, phoneNumber,
                transactionId, transactionType, amount, loanAmount, interestRate, duration,
                paymentAmount, paymentDate);
    }

    public String getBankName()      { return ((Bank)this).getBankName(); }
    public String getBranchCode()    { return ((Bank)this).getBranchCode(); }
    public String getAccountNumber() { return ((Account)this).getAccountNumber(); }
    public double getBalance()       { return ((Account)this).getBalance(); }
    public String getCustomerName()  { return ((Customer)this).getCustomerName(); }

    public void displayRecord() {
        String ID = "25427";
        System.out.println(ID + " ================= BANK ACCOUNT RECORD =================");
        System.out.println(ID + " Bank         : " + getBankName() + " | Branch: " + getBranchCode());
        System.out.println(ID + " Customer     : " + getCustomerName());
        System.out.println(ID + " Account No   : " + getAccountNumber());
        System.out.println(ID + " Balance      : Rs." + String.format("%.2f", getBalance()));
        System.out.println(ID + " Loan Amount  : Rs." + String.format("%.2f", getLoanAmount()));
        System.out.println(ID + " Interest     : Rs." + String.format("%.2f", calculateInterest()));
        System.out.println(ID + " Payment      : Rs." + String.format("%.2f", getPaymentAmount()) +
                " on " + getPaymentDate());
        System.out.println(ID + " =====================================================");
    }
}