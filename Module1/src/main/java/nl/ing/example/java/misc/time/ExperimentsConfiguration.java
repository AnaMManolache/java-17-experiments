package nl.ing.example.java.misc.time;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Clock;
import java.time.InstantSource;

@Configuration
public class ExperimentsConfiguration {
    @Bean
    public InstantSource instantSource() {
        return Clock.systemUTC();
    }
}
