package nl.ing.example.java.misc.time;

import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.time.InstantSource;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TimeTest {

    public static final InstantSource INSTANT_SOURCE = InstantSource.fixed(Instant.MIN);

    @Test
    void getInstanceUsingTestInstanceSource() {
        assertTrue(new Time(INSTANT_SOURCE).getInstant().isBefore(Instant.now()));
    }

    @Test
    void getTimeOfDay() {
        LocalDateTime dateTime = LocalDateTime.of(2022, Month.APRIL, 3, 9, 6);
        Instant instant = dateTime
                .toInstant(ZoneOffset.UTC);

        assertThat(new Time(InstantSource.fixed(instant)).getTimeOfDay(), is("in the morning"));
        assertThat(new Time(InstantSource.fixed(instant.plus(5, ChronoUnit.HOURS))).getTimeOfDay(),
                is("in the afternoon"));
    }
}