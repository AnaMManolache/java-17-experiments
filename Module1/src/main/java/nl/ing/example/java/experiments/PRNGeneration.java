package nl.ing.example.java.experiments;

import java.util.random.RandomGenerator;

public class PRNGeneration {

    public long next() {
        return RandomGenerator.of("L64X256MixRandom").nextInt();
    }
}
