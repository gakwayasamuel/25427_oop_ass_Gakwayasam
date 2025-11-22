package _25427.q9;

class Payment extends Baggage {
    private String paymentDate, paymentMode;

    public Payment(int id, String createdDate, String updatedDate, String airlineName,
                   String address, String contactEmail, String flightNumber, String destination,
                   String departureTime, String passengerName, String passportNumber,
                   String nationality, String seatNumber, String seatType,
                   String ticketNumber, double price, double baggageWeight, double baggageFee,
                   String paymentDate, String paymentMode) throws AirlineDataException {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail, flightNumber,
                destination, departureTime, passengerName, passportNumber, nationality,
                seatNumber, seatType, ticketNumber, price, baggageWeight, baggageFee);
        if (paymentDate == null || paymentDate.isEmpty()) throw new AirlineDataException("Payment date required");
        if (paymentMode == null || paymentMode.trim().isEmpty()) throw new AirlineDataException("Payment mode required");
        this.paymentDate = paymentDate;
        this.paymentMode = paymentMode;
    }
}
