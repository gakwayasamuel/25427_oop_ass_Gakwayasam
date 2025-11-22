package _25427.q7;

class Seller extends Property {
    private String sellerName, contactNumber;

    public Seller(int id, String createdDate, String updatedDate, String agencyName,
                  String location, String phoneNumber, String agentName, String email,
                  String licenseNumber, String propertyCode, String propertyType, double price,
                  String sellerName, String contactNumber) throws RealEstateDataException {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber, agentName,
                email, licenseNumber, propertyCode, propertyType, price);
        if (sellerName == null || sellerName.trim().isEmpty())
            throw new RealEstateDataException("Seller name required");
        if (!contactNumber.matches("\\d{10}"))
            throw new RealEstateDataException("Contact must be 10 digits");
        this.sellerName = sellerName;
        this.contactNumber = contactNumber;
    }

    public String getSellerName() { return sellerName; }   // THIS WAS MISSING
}
