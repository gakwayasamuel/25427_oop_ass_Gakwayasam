package _25427.q5;

class Charge extends Rental {
    private double rentalCharge, penaltyCharge;

    public Charge(int id, String createdDate, String updatedDate, String companyName,
                  String address, String phoneNumber, String branchName, String locationCode,
                  String vehicleType, String registrationNumber, double dailyRate,
                  String rentalDate, String returnDate, int rentalDays,
                  double rentalCharge, double penaltyCharge) throws RentalDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, branchName, locationCode,
                vehicleType, registrationNumber, dailyRate, rentalDate, returnDate, rentalDays);
        if (rentalCharge < 0) throw new RentalDataException("Rental charge cannot be negative");
        if (penaltyCharge < 0) throw new RentalDataException("Penalty charge cannot be negative");
        this.rentalCharge = rentalCharge;
        this.penaltyCharge = penaltyCharge;
    }
    public double getRentalCharge() { return rentalCharge; }
    public double getPenaltyCharge() { return penaltyCharge; }
}
