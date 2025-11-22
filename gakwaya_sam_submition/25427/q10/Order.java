package _25427.q10;

class Order extends Product {
    private String orderDate, orderId;

    public Order(int id, String createdDate, String updatedDate, String storeName,
                 String address, String email, String categoryName, String categoryCode,
                 String productName, String productCode, double price,
                 String orderDate, String orderId) throws ShoppingDataException {
        super(id, createdDate, updatedDate, storeName, address, email, categoryName, categoryCode,
                productName, productCode, price);
        if (orderDate == null || orderDate.isEmpty()) throw new ShoppingDataException("Order date required");
        if (orderId == null || orderId.trim().isEmpty()) throw new ShoppingDataException("Order ID required");
        this.orderDate = orderDate;
        this.orderId = orderId;
    }
}
