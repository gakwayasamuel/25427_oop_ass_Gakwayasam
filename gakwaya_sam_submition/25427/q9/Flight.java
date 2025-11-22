package _25427.q9;

class Flight extends Airline {
    private String flightNumber, destination, departureTime;

    public Flight(int id, String createdDate, String updatedDate, String airlineName,
                  String address, String contactEmail, String flightNumber,
                  String destination, String departureTime) throws AirlineDataException {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail);
        if (flightNumber == null || flightNumber.trim().isEmpty()) throw new AirlineDataException("Flight number required");
        if (destination == null || destination.trim().isEmpty()) throw new AirlineDataException("Destination required");
        if (departureTime == null || departureTime.isEmpty()) throw new AirlineDataException("Departure time required");
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
    }
    public String getFlightNumber() { return flightNumber; }
}
