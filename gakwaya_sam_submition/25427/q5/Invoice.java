package _25427.q5;

class Invoice extends Payment {
    private double totalCharge;

    public Invoice(int id, String createdDate, String updatedDate, String companyName,
                   String address, String phoneNumber, String branchName, String locationCode,
                   String vehicleType, String registrationNumber, double dailyRate,
                   String rentalDate, String returnDate, int rentalDays,
                   double rentalCharge, double penaltyCharge,
                   String paymentMode, String transactionId, double totalCharge)
            throws RentalDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, branchName, locationCode,
                vehicleType, registrationNumber, dailyRate, rentalDate, returnDate, rentalDays,
                rentalCharge, penaltyCharge, paymentMode, transactionId);
        if (totalCharge <= 0) throw new RentalDataException("Total charge must be > 0");
        this.totalCharge = totalCharge;
    }
    public double calculateTotalCharge() {
        return getRentalCharge() + getPenaltyCharge();
    }
}
