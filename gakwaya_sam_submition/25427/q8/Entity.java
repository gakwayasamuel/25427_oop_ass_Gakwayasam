package _25427.q8;

class Entity {
    private int id;
    private String createdDate, updatedDate;

    public Entity(int id, String createdDate, String updatedDate) throws LibraryDataException {
        if (id <= 0) throw new LibraryDataException("ID must be > 0");
        if (createdDate == null || createdDate.isEmpty()) throw new LibraryDataException("Created date required");
        if (updatedDate == null || updatedDate.isEmpty()) throw new LibraryDataException("Updated date required");
        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }
    public int getId() { return id; }
}
