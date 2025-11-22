package _25427.q7;

class Entity {
    private int id;
    private String createdDate, updatedDate;

    public Entity(int id, String createdDate, String updatedDate) throws RealEstateDataException {
        if (id <= 0) throw new RealEstateDataException("ID must be > 0");
        if (createdDate == null || createdDate.isEmpty()) throw new RealEstateDataException("Created date required");
        if (updatedDate == null || updatedDate.isEmpty()) throw new RealEstateDataException("Updated date required");
        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }
    public int getId() { return id; }
}
