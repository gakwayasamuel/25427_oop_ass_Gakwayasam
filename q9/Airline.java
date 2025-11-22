package _25427.q9;

class Airline extends Entity {
    private String airlineName, address, contactEmail;

    public Airline(int id, String createdDate, String updatedDate, String airlineName,
                   String address, String contactEmail) throws AirlineDataException {
        super(id, createdDate, updatedDate);
        if (airlineName == null || airlineName.trim().isEmpty()) throw new AirlineDataException("Airline name required");
        if (address == null || address.trim().isEmpty()) throw new AirlineDataException("Address required");
        if (!contactEmail.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) throw new AirlineDataException("Invalid email");
        this.airlineName = airlineName;
        this.address = address;
        this.contactEmail = contactEmail;
    }
    public String getAirlineName() { return airlineName; }
}
