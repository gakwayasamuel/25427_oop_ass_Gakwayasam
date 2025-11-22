package _25427.q6;

class Withdrawal extends Transaction {
    private double withdrawalAmount;
    private String withdrawalDate;

    public Withdrawal(int id, String createdDate, String updatedDate, String bankName,
                      String branchCode, String address, String accountNumber,
                      String accountType, double balance, String customerName,
                      String email, String phoneNumber, String transactionId,
                      String transactionType, double amount, double withdrawalAmount,
                      String withdrawalDate) throws BankDataException {
        super(id, createdDate, updatedDate, bankName, branchCode, address,
                accountNumber, accountType, balance, customerName, email, phoneNumber,
                transactionId, transactionType, amount);
        if (withdrawalAmount <= 0) throw new BankDataException("Withdrawal amount must be > 0");
        if (withdrawalDate == null || withdrawalDate.isEmpty()) throw new BankDataException("Withdrawal date required");
        this.withdrawalAmount = withdrawalAmount;
        this.withdrawalDate = withdrawalDate;
    }
}
