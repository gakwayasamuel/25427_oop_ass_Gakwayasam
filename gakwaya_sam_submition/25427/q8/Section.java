package _25427.q8;

class Section extends Library {
    private String sectionName, sectionCode;

    public Section(int id, String createdDate, String updatedDate, String libraryName,
                   String location, String phoneNumber, String sectionName, String sectionCode)
            throws LibraryDataException {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber);
        if (sectionName == null || sectionName.trim().isEmpty()) throw new LibraryDataException("Section name required");
        if (!sectionCode.matches("[A-Za-z0-9]{3,}")) throw new LibraryDataException("Section code must be ≥3 characters");
        this.sectionName = sectionName;
        this.sectionCode = sectionCode;
    }
    public String getSectionName() { return sectionName; }
    public String getSectionCode() { return sectionCode; }
}
