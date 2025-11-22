package _25427.q10;

class Product extends Category {
    private String productName, productCode;
    private double price;

    public Product(int id, String createdDate, String updatedDate, String storeName,
                   String address, String email, String categoryName, String categoryCode,
                   String productName, String productCode, double price) throws ShoppingDataException {
        super(id, createdDate, updatedDate, storeName, address, email, categoryName, categoryCode);
        if (productName == null || productName.trim().isEmpty()) throw new ShoppingDataException("Product name required");
        if (productCode == null || productCode.trim().isEmpty()) throw new ShoppingDataException("Product code required");
        if (price <= 0) throw new ShoppingDataException("Price must be > 0");
        this.productName = productName;
        this.productCode = productCode;
        this.price = price;
    }
    public String getProductName() { return productName; }
    public double getPrice() { return price; }
}
