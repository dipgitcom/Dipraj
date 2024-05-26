public class PayPalPayment implements PaymentStrategy {
    @Override
    public boolean pay(double amount) {
        System.out.println("making payment using PayPal ");
        // do something
        return true;
    }
}
