package _25427.q8;

class Record extends Payment {
    private double totalFine;

    public Record(int id, String createdDate, String updatedDate, String libraryName,
                  String location, String phoneNumber, String sectionName, String sectionCode,
                  String title, String author, String ISBN, String borrowDate, String returnDate,
                  double fineAmount, int daysLate, String paymentDate, String paymentMode,
                  double totalFine) throws LibraryDataException {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber, sectionName, sectionCode,
                title, author, ISBN, borrowDate, returnDate, fineAmount, daysLate, paymentDate, paymentMode);
        if (totalFine <= 0) throw new LibraryDataException("Total fine must be > 0");
        this.totalFine = totalFine;
    }
}
