package _25427.q10;

class Entity {
    private int id;
    private String createdDate, updatedDate;

    public Entity(int id, String createdDate, String updatedDate) throws ShoppingDataException {
        if (id <= 0) throw new ShoppingDataException("ID must be > 0");
        if (createdDate == null || createdDate.isEmpty()) throw new ShoppingDataException("Created date required");
        if (updatedDate == null || updatedDate.isEmpty()) throw new ShoppingDataException("Updated date required");
        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }
}
