package _25427.q9;

final class TicketRecord extends Invoice {

    public TicketRecord(int id, String createdDate, String updatedDate, String airlineName,
                        String address, String contactEmail, String flightNumber, String destination,
                        String departureTime, String passengerName, String passportNumber,
                        String nationality, String seatNumber, String seatType,
                        String ticketNumber, double price, double baggageWeight, double baggageFee,
                        String paymentDate, String paymentMode, double totalFare)
            throws AirlineDataException {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail, flightNumber,
                destination, departureTime, passengerName, passportNumber, nationality,
                seatNumber, seatType, ticketNumber, price, baggageWeight, baggageFee,
                paymentDate, paymentMode, totalFare);
    }

    public double generateInvoice() {
        return ((Ticket)this).getPrice() + ((Baggage)this).getBaggageFee();
    }

    public void displayRecord() {
        String ID = "25427";
        System.out.println(ID + " ================= TICKET RECORD =================");
        System.out.println(ID + " Airline     : " + ((Airline)this).getAirlineName());
        System.out.println(ID + " Flight      : " + ((Flight)this).getFlightNumber() + " to " + ((Flight)this).destination);
        System.out.println(ID + " Passenger   : " + ((Passenger)this).getPassengerName());
        System.out.println(ID + " Seat        : " + ((Seat)this).getSeatNumber() + " (" + ((Seat)this).seatType + ")");
        System.out.println(ID + " Base Price  : Rs." + String.format("%.2f", ((Ticket)this).getPrice()));
        System.out.println(ID + " Baggage Fee : Rs." + String.format("%.2f", ((Baggage)this).getBaggageFee()));
        System.out.println(ID + " TOTAL FARE  : Rs." + String.format("%.2f", generateInvoice()));
        System.out.println(ID + " Payment     : " + ((Payment)this).paymentMode + " on " + ((Payment)this).paymentDate);
        System.out.println(ID + " =================================================");
    }
}
