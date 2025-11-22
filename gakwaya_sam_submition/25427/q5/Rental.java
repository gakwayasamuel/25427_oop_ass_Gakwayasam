package _25427.q5;

class Rental extends Vehicle {
    private String rentalDate, returnDate;
    private int rentalDays;

    public Rental(int id, String createdDate, String updatedDate, String companyName,
                  String address, String phoneNumber, String branchName, String locationCode,
                  String vehicleType, String registrationNumber, double dailyRate,
                  String rentalDate, String returnDate, int rentalDays) throws RentalDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, branchName, locationCode,
                vehicleType, registrationNumber, dailyRate);
        if (rentalDate == null || rentalDate.isEmpty()) throw new RentalDataException("Rental date required");
        if (returnDate == null || returnDate.isEmpty()) throw new RentalDataException("Return date required");
        if (rentalDays <= 0) throw new RentalDataException("Rental days must be > 0");
        this.rentalDate = rentalDate;
        this.returnDate = returnDate;
        this.rentalDays = rentalDays;
    }
    public int getRentalDays() { return rentalDays; }
}
