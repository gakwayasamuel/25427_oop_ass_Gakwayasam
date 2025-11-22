package _25427.q7;

class Commission extends Payment {
    private double commissionRate, commissionAmount;

    public Commission(int id, String createdDate, String updatedDate, String agencyName,
                      String location, String phoneNumber, String agentName, String email,
                      String licenseNumber, String propertyCode, String propertyType, double price,
                      String agreementDate, String terms, double paymentAmount, String paymentDate,
                      double commissionRate) throws RealEstateDataException {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber, agentName,
                email, licenseNumber, propertyCode, propertyType, price, agreementDate, terms,
                paymentAmount, paymentDate);
        if (commissionRate < 0) throw new RealEstateDataException("Commission rate cannot be negative");
        this.commissionRate = commissionRate;
        this.commissionAmount = (price * commissionRate) / 100;
    }
    public double getCommissionAmount() { return commissionAmount; }
    public double getCommissionRate() { return commissionRate; }
}
