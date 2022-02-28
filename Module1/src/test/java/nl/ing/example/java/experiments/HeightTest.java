package nl.ing.example.java.experiments;

import org.junit.jupiter.api.Test;

import static nl.ing.example.java.experiments.Height.MeasurementUnit.CM;
import static nl.ing.example.java.experiments.Height.MeasurementUnit.M;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class HeightTest {

    @Test
    void testConvertFromMetersToCentimeters() {
        assertThat(new Height(M, 1.6).inCM(), is(new Height(CM, 160)));
    }

    @Test
    void testConvertFromCentimetersToMeters() {
        assertThat(new Height(CM, 160).inM(), is(new Height(M, 1.60)));
    }

    @Test
    void testAbsentMeasurementUnit() {
        assertThat(new Height(null, 160).inCM(), is(new Height(CM, 160)));
    }

    @Test
    void testGuardPattern() {
        assertThat(Height.formatValue("   123"), is("123"));
        assertThat(Height.formatValue(123), is("123"));
        assertThat(Height.formatValue(123L), is("123"));
    }

}