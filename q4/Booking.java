package _25427.q4;

class Booking extends Room {
    private String bookingDate, checkInDate, checkOutDate;

    public Booking(int id, String createdDate, String updatedDate, String hotelName,
                   String address, String phoneNumber, String email, String roomNumber,
                   String roomType, double pricePerNight, String customerName,
                   String customerEmail, String contactNumber, String bookingDate,
                   String checkInDate, String checkOutDate) throws HotelDataException {
        super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email,
                roomNumber, roomType, pricePerNight);
        if (bookingDate == null || bookingDate.isEmpty()) throw new HotelDataException("Booking date required");
        if (checkInDate == null || checkInDate.isEmpty()) throw new HotelDataException("Check-in date required");
        if (checkOutDate == null || checkOutDate.isEmpty()) throw new HotelDataException("Check-out date required");
        this.bookingDate = bookingDate; this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }
    public String getCheckInDate() { return checkInDate; }
    public String getCheckOutDate() { return checkOutDate; }
}
