package _25427.q8;

class Payment extends Fine {
    private String paymentDate, paymentMode;

    public Payment(int id, String createdDate, String updatedDate, String libraryName,
                   String location, String phoneNumber, String sectionName, String sectionCode,
                   String title, String author, String ISBN, String borrowDate, String returnDate,
                   double fineAmount, int daysLate, String paymentDate, String paymentMode)
            throws LibraryDataException {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber, sectionName, sectionCode,
                title, author, ISBN, borrowDate, returnDate, fineAmount, daysLate);
        if (paymentDate == null || paymentDate.isEmpty()) throw new LibraryDataException("Payment date required");
        if (paymentMode == null || paymentMode.trim().isEmpty()) throw new LibraryDataException("Payment mode required");
        this.paymentDate = paymentDate;
        this.paymentMode = paymentMode;
    }
}
