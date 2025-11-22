package _25427.q6;

class Bank extends Entity {
    private String bankName, branchCode, address;

    public Bank(int id, String createdDate, String updatedDate, String bankName,
                String branchCode, String address) throws BankDataException {
        super(id, createdDate, updatedDate);
        if (bankName == null || bankName.trim().isEmpty()) throw new BankDataException("Bank name required");
        if (!branchCode.matches("[A-Za-z0-9]{3,}")) throw new BankDataException("Branch code must be ≥3 characters");
        if (address == null || address.trim().isEmpty()) throw new BankDataException("Address required");
        this.bankName = bankName;
        this.branchCode = branchCode;
        this.address = address;
    }
    public String getBankName() { return bankName; }
    public String getBranchCode() { return branchCode; }
}
