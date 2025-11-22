package _25427.q5;

class Company extends Entity {
    private String companyName, address, phoneNumber;

    public Company(int id, String createdDate, String updatedDate, String companyName,
                   String address, String phoneNumber) throws RentalDataException {
        super(id, createdDate, updatedDate);
        if (companyName == null || companyName.trim().isEmpty()) throw new RentalDataException("Company name required");
        if (address == null || address.trim().isEmpty()) throw new RentalDataException("Address required");
        if (!phoneNumber.matches("\\d{10}")) throw new RentalDataException("Phone must be 10 digits");
        this.companyName = companyName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    public String getCompanyName() { return companyName; }
}
