public class BkashPayment implements PaymentStrategy {
    @Override
    public boolean pay(double amount) {
        System.out.println("making payment using Bkash ");
        // do something
        return true;
    }
}
