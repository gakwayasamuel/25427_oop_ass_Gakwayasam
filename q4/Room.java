package _25427.q4;

class Room extends Hotel {
    private String roomNumber, roomType;
    private double pricePerNight;

    public Room(int id, String createdDate, String updatedDate, String hotelName,
                String address, String phoneNumber, String email, String roomNumber,
                String roomType, double pricePerNight) throws HotelDataException {
        super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email);
        if (roomNumber == null || roomNumber.trim().isEmpty()) throw new HotelDataException("Room number required");
        if (roomType == null || roomType.trim().isEmpty()) throw new HotelDataException("Room type required");
        if (pricePerNight <= 0) throw new HotelDataException("Price per night must be > 0");
        this.roomNumber = roomNumber; this.roomType = roomType;
        this.pricePerNight = pricePerNight;
    }
    public double getPricePerNight() { return pricePerNight; }
    public String getRoomNumber() { return roomNumber; }
}
