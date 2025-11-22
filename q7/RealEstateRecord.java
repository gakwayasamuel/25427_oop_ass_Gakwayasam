package _25427.q7;

final class RealEstateRecord extends Commission {

    public RealEstateRecord(int id, String createdDate, String updatedDate, String agencyName,
                            String location, String phoneNumber, String agentName, String email,
                            String licenseNumber, String propertyCode, String propertyType, double price,
                            String agreementDate, String terms, double paymentAmount, String paymentDate,
                            double commissionRate) throws RealEstateDataException {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber, agentName,
                email, licenseNumber, propertyCode, propertyType, price, agreementDate, terms,
                paymentAmount, paymentDate, commissionRate);
    }

    // Safe getters
    public String getAgencyName()     { return ((Agency)this).getAgencyName(); }
    public String getAgentName()      { return ((Agent)this).getAgentName(); }
    public String getPropertyCode()   { return ((Property)this).getPropertyCode(); }
    public double getPrice()          { return ((Property)this).getPrice(); }
    public String getSellerName()     { return ((Seller)this).getSellerName(); }
    public String getBuyerName()      { return ((Buyer)this).getBuyerName(); }
    public double getPaymentAmount()  { return ((Payment)this).getPaymentAmount(); }
    public double calculateCommission() { return ((Commission)this).getCommissionAmount(); }

    public void displayRecord() {
        String ID = "25427";
        System.out.println(ID + " ================= REAL ESTATE RECORD =================");
        System.out.println(ID + " Agency      : " + getAgencyName());
        System.out.println(ID + " Agent       : " + getAgentName());
        System.out.println(ID + " Property    : " + getPropertyCode() + " | Rs." + String.format("%.2f", getPrice()));
        System.out.println(ID + " Seller      : " + getSellerName());
        System.out.println(ID + " Buyer       : " + getBuyerName());
        System.out.println(ID + " Payment     : Rs." + String.format("%.2f", getPaymentAmount()));
        System.out.println(ID + " Commission  : Rs." + String.format("%.2f", calculateCommission()));
        System.out.println(ID + " ====================================================");
    }
}