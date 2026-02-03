// Defines a family of algorithms, puts each in a separate class, and lets you choose which algorithm to use at runtime.
// Helps to avoid if-else or switch mess when multiple behaviors are possible.


package DesignPatterns.BehavioralPattern;


// Step 1: Strategy interface
interface PaymentStrategy {
    void pay(int amount);
}

// Step 2: Concrete strategies
class CreditCardPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}

class PayPalPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using PayPal");
    }
}

// Step 3: Context class
class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    public ShoppingCart(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(int amount) {
        paymentStrategy.pay(amount);
    }
}

// Step 4: Client code
public class StrategyMain {
    public static void main(String[] args) {
        ShoppingCart cart1 = new ShoppingCart(new CreditCardPayment());
        cart1.checkout(100); // Output: Paid 100 using Credit Card

        ShoppingCart cart2 = new ShoppingCart(new PayPalPayment());
        cart2.checkout(200); // Output: Paid 200 using PayPal
    }
}
