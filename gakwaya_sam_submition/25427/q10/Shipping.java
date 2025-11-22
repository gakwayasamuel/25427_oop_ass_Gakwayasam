package _25427.q10;

class Shipping extends Payment {
    private String shippingAddress;
    private double shippingCost;

    public Shipping(int id, String createdDate, String updatedDate, String storeName,
                    String address, String email, String categoryName, String categoryCode,
                    String productName, String productCode, double price,
                    String orderDate, String orderId, String paymentMethod, String paymentStatus,
                    String shippingAddress, double shippingCost) throws ShoppingDataException {
        super(id, createdDate, updatedDate, storeName, address, email, categoryName, categoryCode,
                productName, productCode, price, orderDate, orderId, paymentMethod, paymentStatus);
        if (shippingAddress == null || shippingAddress.trim().isEmpty()) throw new ShoppingDataException("Shipping address required");
        if (shippingCost < 0) throw new ShoppingDataException("Shipping cost cannot be negative");
        this.shippingAddress = shippingAddress;
        this.shippingCost = shippingCost;
    }
    public double getShippingCost() { return shippingCost; }
}
