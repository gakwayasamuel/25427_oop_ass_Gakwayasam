package _25427.q7;

class Buyer extends Property {
    private String buyerName, email;

    public Buyer(int id, String createdDate, String updatedDate, String agencyName,
                 String location, String phoneNumber, String agentName, String email,
                 String licenseNumber, String propertyCode, String propertyType, double price,
                 String buyerName, String email) throws RealEstateDataException {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber, agentName,
                email, licenseNumber, propertyCode, propertyType, price);
        if (buyerName == null || buyerName.trim().isEmpty()) throw new RealEstateDataException("Buyer name required");
        if (!email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) throw new RealEstateDataException("Invalid buyer email");
        this.buyerName = buyerName;
        this.email = email;
    }
    public String getBuyerName() { return buyerName; }
}