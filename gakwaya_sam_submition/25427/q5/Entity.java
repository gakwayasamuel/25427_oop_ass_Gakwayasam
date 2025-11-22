package _25427.q5;

class Entity {
    private int id;
    private String createdDate;
    private String updatedDate;

    public Entity(int id, String createdDate, String updatedDate) throws RentalDataException {
        if (id <= 0) throw new RentalDataException("ID must be greater than 0");
        if (createdDate == null || createdDate.isEmpty()) throw new RentalDataException("Created date required");
        if (updatedDate == null || updatedDate.isEmpty()) throw new RentalDataException("Updated date required");
        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }
    public int getId() { return id; }
}
