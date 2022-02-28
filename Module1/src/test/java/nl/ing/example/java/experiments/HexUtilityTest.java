package nl.ing.example.java.experiments;

import org.junit.jupiter.api.Test;

import java.util.HexFormat;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class HexUtilityTest {
    @Test
    void decimalToHexConversion() {
        assertThat(HexFormat.of().withUpperCase().toHexDigits(432645732), is("19C9A664"));
    }

    @Test
    void hexToDecimalConversion() {
        assertThat(HexFormat.fromHexDigitsToLong("19C9A664"), is(432645732L));
    }
}
