package nl.ing.example.java.misc.sealed;

public class Wrenches {
    public static final class MonkeyWrench extends Wrench {
    }

    //must be added on Wrench's 'permits' list to compile
   // public static final class SpannerWrench extends Wrench { }
}
