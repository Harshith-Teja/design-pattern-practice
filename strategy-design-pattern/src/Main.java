public class Main {
    public static void main(String[] args) {

        Checkout checkout = new Checkout();

        checkout.setPaymentStrategy(new CreditCardPayment());
        checkout.completePayment(1000);

        checkout.setPaymentStrategy(new UpiPayment());
        checkout.completePayment(500);
    }
}