package _25427.q9;

class Entity {
    private int id;
    private String createdDate, updatedDate;

    public Entity(int id, String createdDate, String updatedDate) throws AirlineDataException {
        if (id <= 0) throw new AirlineDataException("ID must be > 0");
        if (createdDate == null || createdDate.isEmpty()) throw new AirlineDataException("Created date required");
        if (updatedDate == null || updatedDate.isEmpty()) throw new AirlineDataException("Updated date required");
        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }
}
