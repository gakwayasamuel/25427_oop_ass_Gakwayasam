package _25427.q9;

class Baggage extends Ticket {
    private double baggageWeight, baggageFee;

    public Baggage(int id, String createdDate, String updatedDate, String airlineName,
                   String address, String contactEmail, String flightNumber, String destination,
                   String departureTime, String passengerName, String passportNumber,
                   String nationality, String seatNumber, String seatType,
                   String ticketNumber, double price, double baggageWeight, double baggageFee)
            throws AirlineDataException {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail, flightNumber,
                destination, departureTime, passengerName, passportNumber, nationality,
                seatNumber, seatType, ticketNumber, price);
        if (baggageWeight < 0) throw new AirlineDataException("Baggage weight cannot be negative");
        if (baggageFee < 0) throw new AirlineDataException("Baggage fee cannot be negative");
        this.baggageWeight = baggageWeight;
        this.baggageFee = baggageFee;
    }
    public double getBaggageFee() { return baggageFee; }
}
