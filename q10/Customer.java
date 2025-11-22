package _25427.q10;

class Customer extends Store {
    private String customerName, contactNumber, customerAddress;

    public Customer(int id, String createdDate, String updatedDate, String storeName,
                    String address, String email, String customerName, String contactNumber,
                    String customerAddress) throws ShoppingDataException {
        super(id, createdDate, updatedDate, storeName, address, email);
        if (customerName == null || customerName.trim().isEmpty()) throw new ShoppingDataException("Customer name required");
        if (!contactNumber.matches("\\d{10}")) throw new ShoppingDataException("Contact must be 10 digits");
        if (customerAddress == null || customerAddress.trim().isEmpty()) throw new ShoppingDataException("Customer address required");
        this.customerName = customerName;
        this.contactNumber = contactNumber;
        this.customerAddress = customerAddress;
    }
    public String getCustomerName() { return customerName; }
}
