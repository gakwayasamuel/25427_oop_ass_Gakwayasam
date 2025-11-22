package _25427.q5;

class Payment extends Charge {
    private String paymentMode, transactionId;

    public Payment(int id, String createdDate, String updatedDate, String companyName,
                   String address, String phoneNumber, String branchName, String locationCode,
                   String vehicleType, String registrationNumber, double dailyRate,
                   String rentalDate, String returnDate, int rentalDays,
                   double rentalCharge, double penaltyCharge,
                   String paymentMode, String transactionId) throws RentalDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, branchName, locationCode,
                vehicleType, registrationNumber, dailyRate, rentalDate, returnDate, rentalDays,
                rentalCharge, penaltyCharge);
        if (paymentMode == null || paymentMode.trim().isEmpty()) throw new RentalDataException("Payment mode required");
        if (transactionId == null || transactionId.trim().isEmpty()) throw new RentalDataException("Transaction ID required");
        this.paymentMode = paymentMode;
        this.transactionId = transactionId;
    }

    public String getPaymentMode() { return paymentMode; }
    public String getTransactionId() { return transactionId; }   // THIS WAS MISSING
}
