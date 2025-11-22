package _25427.q4;

class Payment extends Service {
    private String paymentMethod;
    private String paymentDate;

    public Payment(int id, String createdDate, String updatedDate, String hotelName,
                   String address, String phoneNumber, String email, String roomNumber,
                   String roomType, double pricePerNight, String customerName,
                   String customerEmail, String contactNumber, String bookingDate,
                   String checkInDate, String checkOutDate, String serviceName,
                   double serviceCost, String paymentMethod, String paymentDate)
            throws HotelDataException {
        super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email,
                roomNumber, roomType, pricePerNight, customerName, customerEmail,
                contactNumber, bookingDate, checkInDate, checkOutDate, serviceName, serviceCost);

        if (paymentMethod == null || paymentMethod.trim().isEmpty())
            throw new HotelDataException("Payment method required");
        if (paymentDate == null || paymentDate.trim().isEmpty())
            throw new HotelDataException("Payment date required");

        this.paymentMethod = paymentMethod;
        this.paymentDate = paymentDate;
    }

    public String getPaymentMethod() { return paymentMethod; }
    public String getPaymentDate() { return paymentDate; }
}