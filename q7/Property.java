package _25427.q7;

class Property extends Agent {
    private String propertyCode, propertyType;
    private double price;

    public Property(int id, String createdDate, String updatedDate, String agencyName,
                    String location, String phoneNumber, String agentName, String email,
                    String licenseNumber, String propertyCode, String propertyType, double price)
            throws RealEstateDataException {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber, agentName, email, licenseNumber);
        if (propertyCode == null || propertyCode.trim().isEmpty()) throw new RealEstateDataException("Property code required");
        if (propertyType == null || propertyType.trim().isEmpty()) throw new RealEstateDataException("Property type required");
        if (price <= 0) throw new RealEstateDataException("Price must be > 0");
        this.propertyCode = propertyCode;
        this.propertyType = propertyType;
        this.price = price;
    }
    public double getPrice() { return price; }
    public String getPropertyCode() { return propertyCode; }
}