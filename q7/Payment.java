package _25427.q7;

class Payment extends Agreement {
    private double paymentAmount;
    private String paymentDate;

    public Payment(int id, String createdDate, String updatedDate, String agencyName,
                   String location, String phoneNumber, String agentName, String email,
                   String licenseNumber, String propertyCode, String propertyType, double price,
                   String agreementDate, String terms, double paymentAmount, String paymentDate)
            throws RealEstateDataException {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber, agentName,
                email, licenseNumber, propertyCode, propertyType, price, agreementDate, terms);
        if (paymentAmount <= 0) throw new RealEstateDataException("Payment amount must be > 0");
        if (paymentDate == null || paymentDate.isEmpty()) throw new RealEstateDataException("Payment date required");
        this.paymentAmount = paymentAmount;
        this.paymentDate = paymentDate;
    }
    public double getPaymentAmount() { return paymentAmount; }
}
