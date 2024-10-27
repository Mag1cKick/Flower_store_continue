package test.java.flower.store.payment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentTest {
    @Test
    void testCreditCardPayment() {
        Payment payment = new CreditCardPaymentStrategy();
        payment.pay(100.0);
        // Add assertions as necessary
    }

    @Test
    void testPayPalPayment() {
        Payment payment = new PayPalPaymentStrategy();
        payment.pay(200.0);
        // Add assertions as necessary
    }
}
