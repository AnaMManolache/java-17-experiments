package nl.ing.example.java.experiments;

import java.util.Random;

public class StreamChanges {

    public static void main(String[] args) {
        System.out.println(new Random().ints(9).boxed().toList());


    }
}
