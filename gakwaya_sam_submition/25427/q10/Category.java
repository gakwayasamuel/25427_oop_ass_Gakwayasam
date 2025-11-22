package _25427.q10;

class Category extends Store {
    private String categoryName, categoryCode;

    public Category(int id, String createdDate, String updatedDate, String storeName,
                    String address, String email, String categoryName, String categoryCode)
            throws ShoppingDataException {
        super(id, createdDate, updatedDate, storeName, address, email);
        if (categoryName == null || categoryName.trim().isEmpty()) throw new ShoppingDataException("Category name required");
        if (!categoryCode.matches("[A-Za-z0-9]{3,}")) throw new ShoppingDataException("Category code must be ≥3 characters");
        this.categoryName = categoryName;
        this.categoryCode = categoryCode;
    }
    public String getCategoryName() { return categoryName; }
}
