package _25427.q4;

class Bill extends Payment {
    private double roomCharge, serviceCharge;

    public Bill(int id, String createdDate, String updatedDate, String hotelName,
                String address, String phoneNumber, String email, String roomNumber,
                String roomType, double pricePerNight, String customerName,
                String customerEmail, String contactNumber, String bookingDate,
                String checkInDate, String checkOutDate, String serviceName,
                double serviceCost, String paymentMethod, String paymentDate,
                double roomCharge, double serviceCharge) throws HotelDataException {
        super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email,
                roomNumber, roomType, pricePerNight, customerName, customerEmail,
                contactNumber, bookingDate, checkInDate, checkOutDate, serviceName,
                serviceCost, paymentMethod, paymentDate);
        if (roomCharge <= 0) throw new HotelDataException("Room charge must be > 0");
        if (serviceCharge < 0) throw new HotelDataException("Service charge cannot be negative");
        this.roomCharge = roomCharge;
        this.serviceCharge = serviceCharge;
    }
    public double getRoomCharge() { return roomCharge; }
    public double getServiceCharge() { return serviceCharge; }
    public double generateBill() { return roomCharge + serviceCharge; }
}
