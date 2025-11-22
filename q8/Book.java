package _25427.q8;

class Book extends Section {
    private String title, author, ISBN;

    public Book(int id, String createdDate, String updatedDate, String libraryName,
                String location, String phoneNumber, String sectionName, String sectionCode,
                String title, String author, String ISBN) throws LibraryDataException {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber, sectionName, sectionCode);
        if (title == null || title.trim().isEmpty()) throw new LibraryDataException("Book title required");
        if (author == null || author.trim().isEmpty()) throw new LibraryDataException("Author required");
        if (ISBN == null || ISBN.length() < 10) throw new LibraryDataException("ISBN must be ≥10 characters");
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }
    public String getTitle() { return title; }
    public String getISBN() { return ISBN; }
}
