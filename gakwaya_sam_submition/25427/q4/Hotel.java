package _25427.q4;

class Hotel extends Entity {
    private String hotelName, address, phoneNumber, email;

    public Hotel(int id, String createdDate, String updatedDate, String hotelName,
                 String address, String phoneNumber, String email) throws HotelDataException {
        super(id, createdDate, updatedDate);
        if (hotelName == null || hotelName.trim().isEmpty()) throw new HotelDataException("Hotel name required");
        if (address == null || address.trim().isEmpty()) throw new HotelDataException("Address required");
        if (!phoneNumber.matches("\\d{10}")) throw new HotelDataException("Phone must be 10 digits");
        if (!email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) throw new HotelDataException("Invalid email");
        this.hotelName = hotelName; this.address = address;
        this.phoneNumber = phoneNumber; this.email = email;
    }
    public String getHotelName() { return hotelName; }
    public String getAddress() { return address; }
}
