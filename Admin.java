import java.util.*;
import java.util.stream.Collectors;

public class Admin extends Users {
    private boolean privileged = true;

    public Admin() {
        System.out.println("Admin account created with full privileges.");
    }
    // sort by total price after applying discount
    public List<Order> sortOrdersByTotalPrice(List<Order> orders, int discountPercentage) {
        return orders.stream()
                .peek(order -> order.applyDiscount(discountPercentage)) 
                .sorted(Comparator.comparingInt(Order::calculateOrder))  
                .collect(Collectors.toList());
    }

    // Admin can apply discounts to products because of high privileges
    public List<Product> applyDiscountToProducts(List<Product> products, int discountPercentage) {
        return products.stream()
                .peek(product -> {
                    int discountedPrice = product.getprice() * (100 - discountPercentage) / 100;
                    product.price = discountedPrice; // Update the price directly
                })
                .collect(Collectors.toList());
    }

    // Admin credentials
    public String AdminCreds() {
        return super.setCreds();
    }
}
