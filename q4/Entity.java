package _25427.q4;

class Entity {
    private int id;
    private String createdDate;
    private String updatedDate;

    public Entity(int id, String createdDate, String updatedDate) throws HotelDataException {
        if (id <= 0) throw new HotelDataException("ID must be greater than 0");
        if (createdDate == null || createdDate.isEmpty()) throw new HotelDataException("Created date required");
        if (updatedDate == null || updatedDate.isEmpty()) throw new HotelDataException("Updated date required");
        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }
    public int getId() { return id; }
    public String getCreatedDate() { return createdDate; }
}
