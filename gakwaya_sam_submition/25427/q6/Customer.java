package _25427.q6;

class Customer extends Account {
    private String customerName, email, phoneNumber;

    public Customer(int id, String createdDate, String updatedDate, String bankName,
                    String branchCode, String address, String accountNumber,
                    String accountType, double balance, String customerName,
                    String email, String phoneNumber) throws BankDataException {
        super(id, createdDate, updatedDate, bankName, branchCode, address,
                accountNumber, accountType, balance);
        if (customerName == null || customerName.trim().isEmpty()) throw new BankDataException("Customer name required");
        if (!email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) throw new BankDataException("Invalid email");
        if (!phoneNumber.matches("\\d{10}")) throw new BankDataException("Phone must be 10 digits");
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    public String getCustomerName() { return customerName; }
}
