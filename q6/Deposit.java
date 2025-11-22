package _25427.q6;

class Deposit extends Transaction {
    private double depositAmount;
    private String depositDate;

    public Deposit(int id, String createdDate, String updatedDate, String bankName,
                   String branchCode, String address, String accountNumber,
                   String accountType, double balance, String customerName,
                   String email, String phoneNumber, String transactionId,
                   String transactionType, double amount, double depositAmount,
                   String depositDate) throws BankDataException {
        super(id, createdDate, updatedDate, bankName, branchCode, address,
                accountNumber, accountType, balance, customerName, email, phoneNumber,
                transactionId, transactionType, amount);
        if (depositAmount <= 0) throw new BankDataException("Deposit amount must be > 0");
        if (depositDate == null || depositDate.isEmpty()) throw new BankDataException("Deposit date required");
        this.depositAmount = depositAmount;
        this.depositDate = depositDate;
    }
}
