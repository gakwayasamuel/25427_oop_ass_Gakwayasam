package _25427.q7;

class Agency extends Entity {
    private String agencyName, location, phoneNumber;

    public Agency(int id, String createdDate, String updatedDate, String agencyName,
                  String location, String phoneNumber) throws RealEstateDataException {
        super(id, createdDate, updatedDate);
        if (agencyName == null || agencyName.trim().isEmpty()) throw new RealEstateDataException("Agency name required");
        if (location == null || location.trim().isEmpty()) throw new RealEstateDataException("Location required");
        if (!phoneNumber.matches("\\d{10}")) throw new RealEstateDataException("Phone must be 10 digits");
        this.agencyName = agencyName;
        this.location = location;
        this.phoneNumber = phoneNumber;
    }
    public String getAgencyName() { return agencyName; }
}
