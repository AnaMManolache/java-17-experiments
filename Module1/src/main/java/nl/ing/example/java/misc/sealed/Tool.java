package nl.ing.example.java.misc.sealed;

public sealed interface Tool {
}

non-sealed class Hammer implements Tool { }

sealed class Wrench implements Tool permits Wrenches.MonkeyWrench { }

final class Drill implements Tool { }

record Scissors() implements Tool { }

