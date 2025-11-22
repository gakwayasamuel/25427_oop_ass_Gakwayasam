package _25427.q5;

class Customer extends Company {
    private String customerName, licenseNumber, contactNumber;

    public Customer(int id, String createdDate, String updatedDate, Company company,
                    String customerName, String licenseNumber, String contactNumber)
            throws RentalDataException {
        super(id, company.getCreatedDate(), company.getUpdatedDate(),
                company.getCompanyName(), company.getAddress(), company.getPhoneNumber());
        if (customerName == null || customerName.trim().isEmpty()) throw new RentalDataException("Customer name required");
        if (licenseNumber == null || licenseNumber.trim().isEmpty()) throw new RentalDataException("License number required");
        if (!contactNumber.matches("\\d{10}")) throw new RentalDataException("Contact must be 10 digits");
        this.customerName = customerName;
        this.licenseNumber = licenseNumber;
        this.contactNumber = contactNumber;
    }
    public String getCustomerName() { return customerName; }
    public String getLicenseNumber() { return licenseNumber; }
}
