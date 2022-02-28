package nl.ing.example.java.misc;

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

    @Test
    void bytesToHexadecimalComversion() {
        HexFormat hexFormat = HexFormat.of().withPrefix("[").withDelimiter(",").withSuffix("]");

        assertThat(hexFormat.formatHex(new byte[] {34, 56, 75}), is("[22],[38],[4b]"));
    }

    @Test
    void hexadecimalToBytesConversion() {
        HexFormat hexFormat = HexFormat.of()
                .withUpperCase()
                .withPrefix("[")
                .withDelimiter(",")
                .withSuffix("]");

        assertThat(hexFormat.parseHex("[22],[38],[4B]"), is(new byte[] {34, 56, 75}));
    }
}
