package _25427.q9;

class Ticket extends Seat {
    private String ticketNumber;
    private double price;

    public Ticket(int id, String createdDate, String updatedDate, String airlineName,
                  String address, String contactEmail, String flightNumber, String destination,
                  String departureTime, String passengerName, String passportNumber,
                  String nationality, String seatNumber, String seatType,
                  String ticketNumber, double price) throws AirlineDataException {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail, flightNumber,
                destination, departureTime, passengerName, passportNumber, nationality,
                seatNumber, seatType);
        if (ticketNumber == null || ticketNumber.trim().isEmpty()) throw new AirlineDataException("Ticket number required");
        if (price <= 0) throw new AirlineDataException("Price must be > 0");
        this.ticketNumber = ticketNumber;
        this.price = price;
    }
    public double getPrice() { return price; }
}
