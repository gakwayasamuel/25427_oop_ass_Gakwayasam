package _25427.q8;

class Member extends Library {
    private String memberName;
    private int memberId;
    private String contactNumber;

    public Member(int id, String createdDate, String updatedDate, String libraryName,
                  String location, String phoneNumber, String memberName, int memberId,
                  String contactNumber) throws LibraryDataException {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber);
        if (memberName == null || memberName.trim().isEmpty())
            throw new LibraryDataException("Member name required");
        if (memberId <= 0)
            throw new LibraryDataException("Member ID must be > 0");
        if (!contactNumber.matches("\\d{10}"))
            throw new LibraryDataException("Contact must be 10 digits");
        this.memberName = memberName;
        this.memberId = memberId;
        this.contactNumber = contactNumber;
    }

    // THESE TWO GETTERS WERE MISSING → THIS WAS THE ERROR!
    public String getMemberName() { return memberName; }
    public int    getMemberId()   { return memberId; }
}