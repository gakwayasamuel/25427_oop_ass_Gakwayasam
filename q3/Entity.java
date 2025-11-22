package _25427.q3;

class Entity {
    private int id;
    private String createdDate;
    private String updatedDate;

    public Entity(int id, String createdDate, String updatedDate) throws PayrollDataException {
        if (id <= 0) throw new PayrollDataException("ID must be greater than 0");
        if (createdDate == null || createdDate.trim().isEmpty()) throw new PayrollDataException("Created date required");
        if (updatedDate == null || updatedDate.trim().isEmpty()) throw new PayrollDataException("Updated date required");
        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public int getId() { return id; }
    public String getCreatedDate() { return createdDate; }
    public String getUpdatedDate() { return updatedDate; }
}
