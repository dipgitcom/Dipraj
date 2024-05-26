public class CreditCardPayment implements PaymentStrategy {
    @Override
    public boolean pay(double amount) {
        System.out.println("making payment using credit ");
        // do something
        return true;
    }
}
