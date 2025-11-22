package _25427.q5;

final class RentalRecord extends Invoice {

    public RentalRecord(int id, String createdDate, String updatedDate, String companyName,
                        String address, String phoneNumber, String branchName, String locationCode,
                        String vehicleType, String registrationNumber, double dailyRate,
                        String rentalDate, String returnDate, int rentalDays,
                        double rentalCharge, double penaltyCharge,
                        String paymentMode, String transactionId, double totalCharge)
            throws RentalDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, branchName, locationCode,
                vehicleType, registrationNumber, dailyRate, rentalDate, returnDate, rentalDays,
                rentalCharge, penaltyCharge, paymentMode, transactionId, totalCharge);
    }

    public void displayRecord() {
        String ID = "25427";
        System.out.println(ID + " ================= VEHICLE RENTAL RECORD =================");
        System.out.println(ID + " Company       : " + ((Company)this).getCompanyName());
        System.out.println(ID + " Branch        : " + ((Branch)this).getBranchName() + " | Code: " + ((Branch)this).getLocationCode());
        System.out.println(ID + " Vehicle       : " + ((Vehicle)this).getRegistrationNumber() + " (" + ((Vehicle)this).getVehicleType() + ")");
        System.out.println(ID + " Daily Rate    : Rs." + String.format("%.2f", ((Vehicle)this).getDailyRate()));
        System.out.println(ID + " Rental Days   : " + ((Rental)this).getRentalDays());
        System.out.println(ID + " Rental Charge : Rs." + String.format("%.2f", ((Charge)this).getRentalCharge()));
        System.out.println(ID + " Penalty       : Rs." + String.format("%.2f", ((Charge)this).getPenaltyCharge()));
        System.out.println(ID + " TOTAL CHARGE  : Rs." + String.format("%.2f", calculateTotalCharge()));
        System.out.println(ID + " Payment       : " + ((Payment)this).getPaymentMode() + " | TxID: " + ((Payment)this).getTransactionId());
        System.out.println(ID + " =========================================================");
    }
}
