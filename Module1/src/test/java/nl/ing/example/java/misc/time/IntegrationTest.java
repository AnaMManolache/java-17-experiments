package nl.ing.example.java.misc.time;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.Clock;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class IntegrationTest {
    @Autowired
    Time time;

    @Test
    void testInstantWithTimeZone() {
        assertTrue(time.getInstant().plusMillis(123).isAfter(Clock.systemUTC().instant()));
    }
}
