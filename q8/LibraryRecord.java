package _25427.q8;

final class LibraryRecord extends Record {

    public LibraryRecord(int id, String createdDate, String updatedDate, String libraryName,
                         String location, String phoneNumber, String sectionName, String sectionCode,
                         String title, String author, String ISBN, String borrowDate, String returnDate,
                         double fineAmount, int daysLate, String paymentDate, String paymentMode,
                         double totalFine) throws LibraryDataException {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber, sectionName, sectionCode,
                title, author, ISBN, borrowDate, returnDate, fineAmount, daysLate, paymentDate, paymentMode, totalFine);
    }

    public double calculateFine() {
        return ((Fine)this).getFineAmount() * ((Fine)this).getDaysLate();
    }

    public void displayRecord() {
        String ID = "25427";
        System.out.println(ID + " ================= LIBRARY RECORD =================");
        System.out.println(ID + " Library     : " + ((Library)this).getLibraryName());
        System.out.println(ID + " Member      : " + ((Member)this).getMemberName() +
                " | ID: " + ((Member)this).getMemberId());
        System.out.println(ID + " Book        : " + ((Book)this).getTitle() +
                " | ISBN: " + ((Book)this).getISBN());
        System.out.println(ID + " Borrow Date : " + ((Borrow)this).getBorrowDate());
        System.out.println(ID + " Return Date : " + ((Borrow)this).getReturnDate());
        System.out.println(ID + " Days Late   : " + ((Fine)this).getDaysLate());
        System.out.println(ID + " Fine Rate   : Rs." + String.format("%.2f", ((Fine)this).getFineAmount()) + " per day");
        System.out.println(ID + " TOTAL FINE  : Rs." + String.format("%.2f", calculateFine()));
        System.out.println(ID + " Payment     : " + ((Payment)this).paymentMode +
                " on " + ((Payment)this).paymentDate);
        System.out.println(ID + " ==================================================");
    }
}
