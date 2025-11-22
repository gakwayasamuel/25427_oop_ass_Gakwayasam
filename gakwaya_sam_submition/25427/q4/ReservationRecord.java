package _25427.q4;

final class ReservationRecord extends Feedback {

    public ReservationRecord(int id, String createdDate, String updatedDate, String hotelName,
                             String address, String phoneNumber, String email, String roomNumber,
                             String roomType, double pricePerNight, String customerName,
                             String customerEmail, String contactNumber, String bookingDate,
                             String checkInDate, String checkOutDate, String serviceName,
                             double serviceCost, String paymentMethod, String paymentDate,
                             double roomCharge, double serviceCharge, int rating, String comments)
            throws HotelDataException {
        super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email,
                roomNumber, roomType, pricePerNight, customerName, customerEmail,
                contactNumber, bookingDate, checkInDate, checkOutDate, serviceName,
                serviceCost, paymentMethod, paymentDate, roomCharge, serviceCharge,
                rating, comments);
    }

    // Simple getters that always work — no casting needed
    public String getHotelName()       { return ((Hotel) this).getHotelName(); }
    public String getRoomNumber()      { return ((Room) this).getRoomNumber(); }
    public String getCustomerName()    { return ((Customer) this).getCustomerName(); }
    public String getCheckInDate()     { return ((Booking) this).getCheckInDate(); }
    public String getCheckOutDate()    { return ((Booking) this).getCheckOutDate(); }
    public double getServiceCost()     { return ((Service) this).getServiceCost(); }
    public String getPaymentMethod()   { return ((Payment) this).getPaymentMethod(); }
    public String getPaymentDate()     { return ((Payment) this).getPaymentDate(); }
    public double getRoomCharge()      { return ((Bill) this).getRoomCharge(); }
    public double generateBill()       { return ((Bill) this).generateBill(); }
    public int    getRating()          { return ((Feedback) this).getRating(); }
    public String getComments()        { return ((Feedback) this).getComments(); }

    public void displayRecord() {
        String ID = "25427";
        System.out.println(ID + " ================= HOTEL RESERVATION RECORD =================");
        System.out.println(ID + " Hotel        : " + getHotelName());
        System.out.println(ID + " Customer     : " + getCustomerName());
        System.out.println(ID + " Room         : " + getRoomNumber());
        System.out.println(ID + " Check-in     : " + getCheckInDate());
        System.out.println(ID + " Check-out    : " + getCheckOutDate());
        System.out.println(ID + " Room Charge  : Rs." + getRoomCharge());
        System.out.println(ID + " Service Cost : Rs." + getServiceCost());
        System.out.println(ID + " TOTAL BILL   : Rs." + generateBill());
        System.out.println(ID + " Payment      : " + getPaymentMethod() + " on " + getPaymentDate());
        System.out.println(ID + " Rating       : " + getRating() + "/5 - " + getComments());
        System.out.println(ID + " ============================================================");
    }
}