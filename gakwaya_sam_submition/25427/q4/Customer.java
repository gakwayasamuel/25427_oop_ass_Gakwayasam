package _25427.q4;

class Customer extends Hotel {
    private String customerName;
    private String customerEmail;
    private String contactNumber;

    public Customer(int id, String createdDate, String updatedDate, String hotelName,
                    String address, String phoneNumber, String email,
                    String customerName, String customerEmail, String contactNumber)
            throws HotelDataException {
        super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email);

        if (customerName == null || customerName.trim().isEmpty())
            throw new HotelDataException("Customer name required");
        if (!customerEmail.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$"))
            throw new HotelDataException("Invalid customer email");
        if (!contactNumber.matches("\\d{10}"))
            throw new HotelDataException("Contact must be 10 digits");

        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.contactNumber = contactNumber;
    }

    // THIS WAS MISSING BEFORE → caused "cannot resolve getCustomerName"
    public String getCustomerName() { return customerName; }
}