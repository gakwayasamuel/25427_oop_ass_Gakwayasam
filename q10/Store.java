package _25427.q10;

class Store extends Entity {
    private String storeName, address, email;

    public Store(int id, String createdDate, String updatedDate, String storeName,
                 String address, String email) throws ShoppingDataException {
        super(id, createdDate, updatedDate);
        if (storeName == null || storeName.trim().isEmpty()) throw new ShoppingDataException("Store name required");
        if (address == null || address.trim().isEmpty()) throw new ShoppingDataException("Address required");
        if (!email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) throw new ShoppingDataException("Invalid email");
        this.storeName = storeName;
        this.address = address;
        this.email = email;
    }
    public String getStoreName() { return storeName; }
}
