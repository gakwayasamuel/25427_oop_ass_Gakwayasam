package _25427.q8;

class Library extends Entity {
    private String libraryName, location, phoneNumber;

    public Library(int id, String createdDate, String updatedDate, String libraryName,
                   String location, String phoneNumber) throws LibraryDataException {
        super(id, createdDate, updatedDate);
        if (libraryName == null || libraryName.trim().isEmpty()) throw new LibraryDataException("Library name required");
        if (location == null || location.trim().isEmpty()) throw new LibraryDataException("Location required");
        if (!phoneNumber.matches("\\d{10}")) throw new LibraryDataException("Phone must be 10 digits");
        this.libraryName = libraryName;
        this.location = location;
        this.phoneNumber = phoneNumber;
    }
    public String getLibraryName() { return libraryName; }
}
