package _25427.q10;

class Invoice extends Shipping {
    private double totalAmount;

    public Invoice(int id, String createdDate, String updatedDate, String storeName,
                   String address, String email, String categoryName, String categoryCode,
                   String productName, String productCode, double price,
                   String orderDate, String orderId, String paymentMethod, String paymentStatus,
                   String shippingAddress, double shippingCost, double totalAmount)
            throws ShoppingDataException {
        super(id, createdDate, updatedDate, storeName, address, email, categoryName, categoryCode,
                productName, productCode, price, orderDate, orderId, paymentMethod, paymentStatus,
                shippingAddress, shippingCost);
        if (totalAmount <= 0) throw new ShoppingDataException("Total amount must be > 0");
        this.totalAmount = totalAmount;
    }
}
