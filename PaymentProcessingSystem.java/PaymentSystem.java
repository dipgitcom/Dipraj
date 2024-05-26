public class PaymentSystem {
    private PaymentStrategy paymentStrategy;

    // Set the payment strategy at runtime
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // Make a payment using the current payment strategy
    public boolean makePayment(double amount) {
        if (paymentStrategy == null) {
            throw new IllegalStateException("Payment strategy not set");
        }
        return paymentStrategy.pay(amount);
    }

    public static void main(String[] args) {
        PaymentSystem paymentSystem = new PaymentSystem();

        // Using BankPayment strategy
        paymentSystem.setPaymentStrategy(new BankPayment());
        paymentSystem.makePayment(200);

        // Using BkashPayment strategy
        paymentSystem.setPaymentStrategy(new BkashPayment());
        paymentSystem.makePayment(500);

        // Using CreditCardPayment strategy
        paymentSystem.setPaymentStrategy(new CreditCardPayment());
        paymentSystem.makePayment(5500);
    }
}
