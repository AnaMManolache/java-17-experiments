package nl.ing.example.java.experiments;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RepoTest {

   // @Test
    void NPEMessagePresent() {
        NullPointerException npe = assertThrows(NullPointerException.class, () -> new Repo(null).branch().author());

        assertThat(npe.getMessage(), containsString("Cannot invoke \"nl.ing.example.java.experiments.model.Repo$Branch.author()\" " +
                "because the return value of \"nl.ing.example.java.experiments.model.Repo.branch()\" is null"));
    }

}