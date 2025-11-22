package _25427.q9;

class Passenger extends Flight {
    private String passengerName, passportNumber, nationality;

    public Passenger(int id, String createdDate, String updatedDate, String airlineName,
                     String address, String contactEmail, String flightNumber,
                     String destination, String departureTime, String passengerName,
                     String passportNumber, String nationality) throws AirlineDataException {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail, flightNumber,
                destination, departureTime);
        if (passengerName == null || passengerName.trim().isEmpty()) throw new AirlineDataException("Passenger name required");
        if (passportNumber == null || passportNumber.trim().isEmpty()) throw new AirlineDataException("Passport number required");
        if (nationality == null || nationality.trim().isEmpty()) throw new AirlineDataException("Nationality required");
        this.passengerName = passengerName;
        this.passportNumber = passportNumber;
        this.nationality = nationality;
    }
    public String getPassengerName() { return passengerName; }
}
