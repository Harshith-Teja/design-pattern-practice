class Checkout {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.paymentStrategy = strategy;
    }

    public void completePayment(int amount) {
        paymentStrategy.pay(amount);
    }
}
