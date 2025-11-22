package _25427.q10;

class Payment extends Order {
    private String paymentMethod, paymentStatus;

    public Payment(int id, String createdDate, String updatedDate, String storeName,
                   String address, String email, String categoryName, String categoryCode,
                   String productName, String productCode, double price,
                   String orderDate, String orderId, String paymentMethod, String paymentStatus)
            throws ShoppingDataException {
        super(id, createdDate, updatedDate, storeName, address, email, categoryName, categoryCode,
                productName, productCode, price, orderDate, orderId);
        if (paymentMethod == null || paymentMethod.trim().isEmpty()) throw new ShoppingDataException("Payment method required");
        if (paymentStatus == null || paymentStatus.trim().isEmpty()) throw new ShoppingDataException("Payment status required");
        this.paymentMethod = paymentMethod;
        this.paymentStatus = paymentStatus;
    }
}
