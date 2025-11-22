package _25427.q10;

final class OrderRecord extends Invoice {

    public OrderRecord(int id, String createdDate, String updatedDate, String storeName,
                       String address, String email, String categoryName, String categoryCode,
                       String productName, String productCode, double price,
                       String orderDate, String orderId, String paymentMethod, String paymentStatus,
                       String shippingAddress, double shippingCost, double totalAmount)
            throws ShoppingDataException {
        super(id, createdDate, updatedDate, storeName, address, email, categoryName, categoryCode,
                productName, productCode, price, orderDate, orderId, paymentMethod, paymentStatus,
                shippingAddress, shippingCost, totalAmount);
    }

    public double calculateTotalAmount() {
        return ((Product)this).getPrice() + ((Shipping)this).getShippingCost();
    }

    public void displayRecord() {
        String ID = "25427";
        System.out.println(ID + " ================= ORDER RECORD =================");
        System.out.println(ID + " Store       : " + ((Store)this).getStoreName());
        System.out.println(ID + " Customer    : " + ((Customer)this).getCustomerName());
        System.out.println(ID + " Product     : " + ((Product)this).getProductName());
        System.out.println(ID + " Price       : Rs." + String.format("%.2f", ((Product)this).getPrice()));
        System.out.println(ID + " Shipping    : Rs." + String.format("%.2f", ((Shipping)this).getShippingCost()));
        System.out.println(ID + " TOTAL       : Rs." + String.format("%.2f", calculateTotalAmount()));
        System.out.println(ID + " Order ID    : " + ((Order)this).orderId);
        System.out.println(ID + " Payment     : " + ((Payment)this).paymentMethod + " | " + ((Payment)this).paymentStatus);
        System.out.println(ID + " ================================================");
    }
}
