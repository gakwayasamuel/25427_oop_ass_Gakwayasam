package _25427.q6;

class Entity {
    private int id;
    private String createdDate;
    private String updatedDate;

    public Entity(int id, String createdDate, String updatedDate) throws BankDataException {
        if (id <= 0) throw new BankDataException("ID must be > 0");
        if (createdDate == null || createdDate.isEmpty()) throw new BankDataException("Created date required");
        if (updatedDate == null || updatedDate.isEmpty()) throw new BankDataException("Updated date required");
        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }
    public int getId() { return id; }
}
