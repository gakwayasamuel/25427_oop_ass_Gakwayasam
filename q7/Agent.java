package _25427.q7;

class Agent extends Agency {
    private String agentName, email, licenseNumber;

    public Agent(int id, String createdDate, String updatedDate, String agencyName,
                 String location, String phoneNumber, String agentName,
                 String email, String licenseNumber) throws RealEstateDataException {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber);
        if (agentName == null || agentName.trim().isEmpty()) throw new RealEstateDataException("Agent name required");
        if (!email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) throw new RealEstateDataException("Invalid agent email");
        if (licenseNumber == null || licenseNumber.trim().isEmpty()) throw new RealEstateDataException("License number required");
        this.agentName = agentName;
        this.email = email;
        this.licenseNumber = licenseNumber;
    }
    public String getAgentName() { return agentName; }
}
