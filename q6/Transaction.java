package _25427.q6;

class Transaction extends Customer {
    private String transactionId, transactionType;
    private double amount;

    public Transaction(int id, String createdDate, String updatedDate, String bankName,
                       String branchCode, String address, String accountNumber,
                       String accountType, double balance, String customerName,
                       String email, String phoneNumber, String transactionId,
                       String transactionType, double amount) throws BankDataException {
        super(id, createdDate, updatedDate, bankName, branchCode, address,
                accountNumber, accountType, balance, customerName, email, phoneNumber);
        if (transactionId == null || transactionId.isEmpty()) throw new BankDataException("Transaction ID required");
        if (transactionType == null || transactionType.isEmpty()) throw new BankDataException("Transaction type required");
        if (amount <= 0) throw new BankDataException("Amount must be > 0");
        this.transactionId = transactionId;
        this.transactionType = transactionType;
        this.amount = amount;
    }
}
