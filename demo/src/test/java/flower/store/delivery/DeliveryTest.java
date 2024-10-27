package test.java.flower.store.delivery;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeliveryTest {
    @Test
    void testPostDelivery() {
        Delivery delivery = new PostDeliveryStrategy();
        delivery.deliver("123 Main St");
        // Add assertions as necessary
    }

    @Test
    void testDHLDelivery() {
        Delivery delivery = new DHLDeliveryStrategy();
        delivery.deliver("456 Elm St");
        // Add assertions as necessary
    }
}
