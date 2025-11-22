package _25427.q7;

class Agreement extends Property {
    private String agreementDate, terms;

    public Agreement(int id, String createdDate, String updatedDate, String agencyName,
                     String location, String phoneNumber, String agentName, String email,
                     String licenseNumber, String propertyCode, String propertyType, double price,
                     String agreementDate, String terms) throws RealEstateDataException {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber, agentName,
                email, licenseNumber, propertyCode, propertyType, price);
        if (agreementDate == null || agreementDate.isEmpty()) throw new RealEstateDataException("Agreement date required");
        if (terms == null || terms.trim().isEmpty()) throw new RealEstateDataException("Terms required");
        this.agreementDate = agreementDate;
        this.terms = terms;
    }
}
