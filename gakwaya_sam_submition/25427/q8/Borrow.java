package _25427.q8;

class Borrow extends Book {
    private String borrowDate, returnDate;

    public Borrow(int id, String createdDate, String updatedDate, String libraryName,
                  String location, String phoneNumber, String sectionName, String sectionCode,
                  String title, String author, String ISBN, String borrowDate, String returnDate)
            throws LibraryDataException {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber, sectionName, sectionCode,
                title, author, ISBN);
        if (borrowDate == null || borrowDate.isEmpty()) throw new LibraryDataException("Borrow date required");
        if (returnDate == null || returnDate.isEmpty()) throw new LibraryDataException("Return date required");
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
    }

    // THESE GETTERS ARE NEEDED IN LibraryRecord
    public String getBorrowDate() { return borrowDate; }
    public String getReturnDate() { return returnDate; }
}
