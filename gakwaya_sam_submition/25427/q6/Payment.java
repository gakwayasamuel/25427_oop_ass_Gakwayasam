package _25427.q6;

class Payment extends Loan {
    private double paymentAmount;
    private String paymentDate;

    public Payment(int id, String createdDate, String updatedDate, String bankName,
                   String branchCode, String address, String accountNumber,
                   String accountType, double balance, String customerName,
                   String email, String phoneNumber, String transactionId,
                   String transactionType, double amount, double loanAmount,
                   double interestRate, int duration, double paymentAmount,
                   String paymentDate) throws BankDataException {
        super(id, createdDate, updatedDate, bankName, branchCode, address,
                accountNumber, accountType, balance, customerName, email, phoneNumber,
                transactionId, transactionType, amount, loanAmount, interestRate, duration);
        if (paymentAmount <= 0) throw new BankDataException("Payment amount must be > 0");
        if (paymentDate == null || paymentDate.isEmpty()) throw new BankDataException("Payment date required");
        this.paymentAmount = paymentAmount;
        this.paymentDate = paymentDate;
    }

    // THESE GETTERS ARE REQUIRED — ADD THEM!
    public double getPaymentAmount() { return paymentAmount; }
    public String getPaymentDate()   { return paymentDate; }
}
