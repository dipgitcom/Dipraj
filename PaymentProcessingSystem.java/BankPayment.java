public class BankPayment implements PaymentStrategy {
    @Override
    public boolean pay(double amount) {
        System.out.println("making payment using Bank ");
        // do something
        return true;
    }
}
