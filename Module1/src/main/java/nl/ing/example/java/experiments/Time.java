package nl.ing.example.java.experiments;

import org.springframework.stereotype.Component;

import java.time.Instant;
import java.time.InstantSource;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

@Component
record Time(InstantSource instantSource) {

    public Instant getInstant() {
        return instantSource.instant();
    }

    public String getTimeOfDay() {
        return DateTimeFormatter.ofPattern("B").format(LocalDateTime.ofInstant(instantSource.instant(), ZoneId.of("UTC")));
    }

}
