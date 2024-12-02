public class Order extends Product {
    //Product extends into Order because I wanted its method for Calculate Order method
    public Order(int productId, int price, int quantity, String name, String brand) {
        super(productId, price, quantity, name, brand);
    }

    // Calculate total price of the order (using getprice() and getquantity() methods from Product)
    public int calculateOrder() {
        return getprice() * getquantity(); // Total price = price per item * quantity
    }

    // Example of applying a discount to the total price of the order
    public int applyDiscount(int discountPercentage) {
        int totalPrice = calculateOrder();
        return totalPrice * (100 - discountPercentage) / 100; // Apply discount
    }

    // Optionally, you could include taxes and shipping in the order calculation
    public double applyTaxAndShipping(double taxRate, double shippingFee) {
        double totalPrice = calculateOrder();
        double taxAmount = totalPrice * taxRate;
        return totalPrice + taxAmount + shippingFee; // Final price including tax and shipping
    }
}
