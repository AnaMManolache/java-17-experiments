package nl.ing.example.java.misc.sealed;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ToolTest {

    @Test
    void testPermittedClasses() {
        assertThat(Arrays.stream(Tool.class.getPermittedSubclasses()).map(Class::getSimpleName).sorted().toList(),
                is(Arrays.asList("Drill", "Hammer", "Scissors", "Wrench")));
    }

    @Test
    void testSealedClasses() {
        assertTrue(Tool.class.isSealed());
        assertFalse(Hammer.class.isSealed());
    }

}