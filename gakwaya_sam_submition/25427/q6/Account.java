package _25427.q6;

class Account extends Bank {
    private String accountNumber, accountType;
    private double balance;

    public Account(int id, String createdDate, String updatedDate, String bankName,
                   String branchCode, String address, String accountNumber,
                   String accountType, double balance) throws BankDataException {
        super(id, createdDate, updatedDate, bankName, branchCode, address);
        if (accountNumber == null || accountNumber.trim().isEmpty()) throw new BankDataException("Account number required");
        if (accountType == null || accountType.trim().isEmpty()) throw new BankDataException("Account type required");
        if (balance < 0) throw new BankDataException("Balance cannot be negative");
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }
    public String getAccountNumber() { return accountNumber; }
    public double getBalance() { return balance; }
}
