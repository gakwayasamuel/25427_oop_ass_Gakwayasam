package _25427.q5;

class Branch extends Company {
    private String branchName, locationCode;

    public Branch(int id, String createdDate, String updatedDate, String companyName,
                  String address, String phoneNumber, String branchName, String locationCode)
            throws RentalDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber);
        if (branchName == null || branchName.trim().isEmpty())
            throw new RentalDataException("Branch name required");
        if (!locationCode.matches("[A-Za-z0-9]{3,}"))
            throw new RentalDataException("Location code must be ≥3 alphanumeric");
        this.branchName = branchName;
        this.locationCode = locationCode;
    }

    public String getBranchName() { return branchName; }
    public String getLocationCode() { return locationCode; }   // THIS WAS MISSING
}
