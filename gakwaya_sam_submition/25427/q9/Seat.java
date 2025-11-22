package _25427.q9;

class Seat extends Passenger {
    private String seatNumber, seatType;

    public Seat(int id, String createdDate, String updatedDate, String airlineName,
                String address, String contactEmail, String flightNumber, String destination,
                String departureTime, String passengerName, String passportNumber,
                String nationality, String seatNumber, String seatType) throws AirlineDataException {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail, flightNumber,
                destination, departureTime, passengerName, passportNumber, nationality);
        if (seatNumber == null || seatNumber.trim().isEmpty()) throw new AirlineDataException("Seat number required");
        if (!seatType.matches("(?i)Economy|Business")) throw new AirlineDataException("Seat type must be Economy or Business");
        this.seatNumber = seatNumber;
        this.seatType = seatType;
    }
    public String getSeatNumber() { return seatNumber; }
}
