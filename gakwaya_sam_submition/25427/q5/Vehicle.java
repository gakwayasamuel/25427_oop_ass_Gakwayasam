package _25427.q5;

class Vehicle extends Branch {
    private String vehicleType, registrationNumber;
    private double dailyRate;

    public Vehicle(int id, String createdDate, String updatedDate, String companyName,
                   String address, String phoneNumber, String branchName, String locationCode,
                   String vehicleType, String registrationNumber, double dailyRate)
            throws RentalDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, branchName, locationCode);
        if (vehicleType == null || vehicleType.trim().isEmpty()) throw new RentalDataException("Vehicle type required");
        if (registrationNumber == null || registrationNumber.trim().isEmpty()) throw new RentalDataException("Registration number required");
        if (dailyRate <= 0) throw new RentalDataException("Daily rate must be > 0");
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
        this.dailyRate = dailyRate;
    }

    public String getRegistrationNumber() { return registrationNumber; }
    public double getDailyRate() { return dailyRate; }
    public String getVehicleType() { return vehicleType; }   // THIS WAS MISSING
}
