package _25427.q6;

class Loan extends Transaction {
    private double loanAmount, interestRate;
    private int duration;

    public Loan(int id, String createdDate, String updatedDate, String bankName,
                String branchCode, String address, String accountNumber,
                String accountType, double balance, String customerName,
                String email, String phoneNumber, String transactionId,
                String transactionType, double amount, double loanAmount,
                double interestRate, int duration) throws BankDataException {
        super(id, createdDate, updatedDate, bankName, branchCode, address,
                accountNumber, accountType, balance, customerName, email, phoneNumber,
                transactionId, transactionType, amount);
        if (loanAmount <= 0) throw new BankDataException("Loan amount must be > 0");
        if (interestRate <= 0) throw new BankDataException("Interest rate must be > 0");
        if (duration <= 0) throw new BankDataException("Duration must be > 0");
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.duration = duration;
    }

    // THESE GETTERS ARE REQUIRED — ADD THEM!
    public double getLoanAmount()    { return loanAmount; }
    public double getInterestRate()  { return interestRate; }
    public int    getDuration()      { return duration; }

    public double calculateInterest() {
        return (loanAmount * interestRate * duration) / 100;
    }
}
